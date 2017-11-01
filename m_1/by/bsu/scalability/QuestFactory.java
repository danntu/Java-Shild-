package m_1.by.bsu.scalability;

public class QuestFactory {
    public static AbstractQuest getQuestFormFactory(int mode){
        switch (mode){
            case 0:
                return  new DragnDropQuest();
            case 1:
                return  new SingleChoiceQuest();
                default:
                    throw new IllegalArgumentException("illegal mode");
        }
    }
}
