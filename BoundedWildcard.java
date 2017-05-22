/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glava14;

/**
 *
 * @author DMyrzaka
 */
class TwoD{
    int x,y;

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}

class ThreeD extends TwoD{
    int z;
    public ThreeD(int z,int x,int y){
        super(x,y);
        this.z=z;
    }
}

class FourD extends ThreeD{
    int t;
    public FourD(int t,int z,int x,int y){
        super(z,x,y);
        this.t=t;
    }
}
class Coords<T extends TwoD>{
    T[] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }
    
}
public class BoundedWildcard {
    static void showXY(Coords<?> c){
        System.out.println("X,Y Coordinates");
        for (int i=0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x+" "+c.coords[i].y);
        System.out.println();
    }
    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("X,Y,Z Coordinates");
        for (int i=0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z);
        System.out.println();
    }
    
    static void showAll(Coords<? extends FourD> c){
        System.out.println("X,Y,Z,T Coordinates");
        for (int i=0;i<c.coords.length;i++)
            System.out.println(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z+" "+c.coords[i].t);
        System.out.println();
    }
    public static void main(String[] args) {
        TwoD td[] ={
            new TwoD(0, 0),
            new TwoD(7, 9),
            new TwoD(18, 4),
            new TwoD(-1, -23)
        };
        Coords<TwoD> tdlocs = new Coords<TwoD>(td);
        System.out.println("tdlocs values");
        showXY(tdlocs);
      
        FourD fd[]={
            new FourD(1, 2, 3, 4),
            new FourD(6, 8, 14, 8),
            new FourD(22, 9, 4, 9),
            new FourD(3, -2, -23, 17)
        };
        Coords<FourD> fdlocs = new Coords<FourD>(fd);
        System.out.println("fdlocs values");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
