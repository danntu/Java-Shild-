import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Transform extends RecursiveAction{
    int seqThreshold;
    double[] data;
    int start,end;

    public Transform(int seqThreshold, double[] data, int start, int end) {
        this.seqThreshold = seqThreshold;
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if((end-start)<seqThreshold){
            for(int i=start;i<end;i++){
                if (data[i] % 2 ==0)
                    data[i]=Math.sqrt(data[i]);
                else
                    data[i]=Math.cbrt(data[i]);
            }
        }
        else{
            int middle=(start+end)/2;
            invokeAll(new Transform(seqThreshold,data,start,middle),new Transform(seqThreshold,data,middle,end));
        }
    }
}
public class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;

        if (args.length != 2){
            System.out.println("Usage: FJExperiment parallelism threshold");
            return;
        }
        pLevel=Integer.parseInt(args[0]);
        threshold=Integer.parseInt(args[1]);
        long beginT,endT;
        ForkJoinPool fjp = new ForkJoinPool(pLevel);
        double nums[]=new double[1000000];
        Transform task=new Transform(threshold,nums,0,nums.length);
        beginT=System.nanoTime();
        fjp.invoke(task);
        endT=System.nanoTime();
        System.out.println("level of parallelism: "+pLevel);
        System.out.println("Sequential threshold: "+threshold);
        System.out.println("Elapsed time: "+(endT-beginT));
    }
}
