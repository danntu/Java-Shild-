import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;

/**
 * Created by DMyrzaka on 12.07.2017.
 */
public class CheckBoxDemo2 extends Applet {
    MyCheckBox myCheckBox1, myCheckBox2, myCheckBox3;

    @Override
    public void init() {
        super.init();
        myCheckBox1=new MyCheckBox("Item1");
        add(myCheckBox1);
        myCheckBox2=new MyCheckBox("Item2");
        add(myCheckBox2);
        myCheckBox3=new MyCheckBox("Item3");
        add(myCheckBox3);

    }

    class MyCheckBox extends Checkbox{
        public MyCheckBox(String label) throws HeadlessException {
            super(label);
            enableEvents(AWTEvent.ITEM_EVENT_MASK);
        }

        @Override
        protected void processItemEvent(ItemEvent e) {
            super.processItemEvent(e);
            showStatus("Checkbox name/state: "+getLabel()+"/"+getState());
        }
    }
}
