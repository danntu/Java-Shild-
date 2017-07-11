import com.sun.corba.se.impl.protocol.giopmsgheaders.FragmentMessage_1_1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by DMyrzaka on 11.07.2017.
 */
class SampleFrame extends Frame{
    SampleFrame(String title){
        super(title);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
public class FileDialogDemo {
    public static void main(String[] args) {
        Frame f = new SampleFrame("File Dialog Demo");
        f.setVisible(true);
        f.setSize(100,100);
        FileDialog fd = new FileDialog(f,"File Dialog");
        fd.setVisible(true);
    }
}
