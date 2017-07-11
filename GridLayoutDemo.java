import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by DMyrzaka on 11.07.2017.
 */
public class GridLayoutDemo extends Applet {
    static final int n=4;

    @Override
    public void init() {
        super.init();
        setLayout(new GridLayout(n,n));
        setFont(new Font("SansSerif",Font.BOLD,24));

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                int k=i*n+j;
                if(k>0) add(new Button(" "+k));
            }
        }
    }
}
