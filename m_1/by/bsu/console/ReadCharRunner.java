package m_1.by.bsu.console;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

public class ReadCharRunner {
    public static void main(String[] args) {
        int x;
        try{
            x=System.in.read();
            char c =(char)x;
            System.out.println("Код символа: "+c+" ="+x);
        } catch (IOException e){
            System.err.println("ошибка ввода "+e);
        }
    }
}
