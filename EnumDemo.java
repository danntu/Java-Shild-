/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glava12;

/**
 *
 * @author DMyrzaka
 */
enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap,Cortland
}

enum Apple1{
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15),Cortland(8);
    private int price;
    Apple1(int p) { price =p;}
    int getPrice() {return price; }
 }

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap; 
        ap = Apple.RedDel;
        System.out.println("Значение ap: "+ap);
        System.out.println();
        
        ap =Apple.GoldenDel;
        
        if (ap==Apple.GoldenDel) System.out.println("ap содержит ColdenDel.\n");
        
        switch(ap){
            case Jonathan: System.out.println("Jhonatan"); break;
            case GoldenDel: System.out.println("Golden Delicious");
        }
    }
}
