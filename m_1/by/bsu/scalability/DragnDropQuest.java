package m_1.by.bsu.scalability;

import m_1.by.bsu.inheritance.AbstractCardAction;

public class DragnDropQuest extends AbstractQuest {
    @Override
    public boolean check(Answer ans) {
        System.out.println("Drag'n'Drop quest");
        return true;
    }
}
