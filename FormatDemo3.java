/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava18;

/**
 *
 * @author DMyrzaka
 */
import java.util.Formatter;
public class FormatDemo3 {
    public static void main(String args[]){
        Formatter fmt = new Formatter();
        fmt.format("Копирование файла%nПеремещение на %d%% завершено", 88);
        System.out.println(fmt);
        fmt.close();
    }
}
