/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava18;

/**
 *
 * @author DMyrzaka
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DMyrzaka
 */
import java.util.*;
class Watcher1 implements Observer{
    public void update(Observable obj, Object arg){
        System.out.println("update() вызваy, count равен "+((Integer)arg).intValue());
    }
}

class Watcher2 implements Observer{
    public void update(Observable obj, Object arg){
      if ( ((Integer)arg).intValue()==0 )
          System.out.println("Ready "+'\7');
    }
}


public class TwoObserververs {
    public static void main(String args[]){
   
        BeingWatched observed = new BeingWatched();
        Watcher1 observing1 = new Watcher1();
        Watcher2 observing2 = new Watcher2();
        observed.addObserver(observing1);
        observed.addObserver(observing2);
        observed.counter(10);
    }
}

