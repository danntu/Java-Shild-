package glava28;

import java.rmi.Naming;

public class AddServer {
    public static void main(String[] args) {
       try{
           AddServerImpl addServerImpl = new AddServerImpl();
           Naming.rebind("AddServer",addServerImpl);
       } catch (Exception e){
           System.out.println("Exception: "+e);
       }

    }
}
