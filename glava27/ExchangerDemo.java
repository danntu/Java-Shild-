package glava27;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<String>();
        new UseString(exgr);
        new MakeString(exgr);
    }
}
class MakeString implements Runnable{
    Exchanger<String> ex;
    String str;

    public MakeString(Exchanger<String> ex) {
        this.ex = ex;
        str= new String();
        new Thread(this).start();
    }

    @Override
    public void run() {
        char ch ='A';
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++)
                str+=(char)ch++;
            try {
                str=ex.exchange(str);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class UseString implements Runnable{
    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> ex) {
        this.ex = ex;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            try{
                str=ex.exchange(new String());
                System.out.println("Получено "+str);
            } catch (InterruptedException e){
                System.out.println(e);
            }

        }
    }
}