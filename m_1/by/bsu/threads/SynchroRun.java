package m_1.by.bsu.threads;

import java.io.IOException;

public class SynchroRun {
    public static void main(String[] args) {
        Resource s = null;
        try{
            s = new Resource("result.txt");
            SyncThread t1 = new SyncThread("First",s);
            SyncThread t2 = new SyncThread("Second",s);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (IOException e){
            System.err.println("Error file :" +e);
        } catch (InterruptedException e){
            System.err.println("Flow error: "+e);
        } finally {
            s.close();
        }
    }
}
