import java.applet.Applet;
import java.awt.*;
import java.awt.event.AdjustmentEvent;

/**
 * Created by DMyrzaka on 12.07.2017.
 */
public class ScrollbarDemo2 extends Applet {
    MyScrollbar myScrollbar;

    @Override
    public void init() {
        super.init();
        myScrollbar = new MyScrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
        myScrollbar.setPreferredSize(new Dimension(100,20));
        add(myScrollbar);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    class MyScrollbar extends Scrollbar{
        public MyScrollbar(int orientation, int value, int visible, int minimum, int maximum) throws HeadlessException {
            super(orientation, value, visible, minimum, maximum);
            enableEvents(AWTEvent.ADJUSTMENT_EVENT_MASK);
        }

        @Override
        protected void processAdjustmentEvent(AdjustmentEvent e) {
            super.processAdjustmentEvent(e);
            showStatus("Adjustment event: "+e.getValue());
            setValue(getValue());
        }
    }

}
