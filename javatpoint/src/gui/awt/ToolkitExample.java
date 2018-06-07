package gui.awt;

import java.awt.*;

/**
 * Created by mdaniyar on 6/7/18.
 */
public class ToolkitExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        System.out.println("Screen resolution = " + toolkit.getScreenResolution());
        Dimension dimension = toolkit.getScreenSize();
        System.out.println("Screen width = " + dimension.getWidth());
        System.out.println("Screen height = " + dimension.getHeight());
    }
}
