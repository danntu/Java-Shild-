package m_1.by.bsu.scalability;

public class SingleChoiceQuest extends AbstractQuest {
    @Override
    public boolean check(Answer ans) {
        System.out.println("Single choice quest");
        return true;
    }
}
