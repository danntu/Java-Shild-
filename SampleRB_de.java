/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava18;

/**
 *
 * @author DMyrzaka
 */
import java.util.*;
public class SampleRB_de extends ListResourceBundle{
    protected Object[][] getContents(){
        Object[][] resources = new Object[3][2];
        resources[0][0]="title";
        resources[0][1]="Mein Program";
        
        resources[1][0]="StopText";
        resources[1][1]="Anschlag";
        
        resources[2][0]="StartText";
        resources[2][1]="Anfang";
        
        return resources;
    }
}
