package m_1.by.bsu.scalability;

public abstract class AbstractQuest {
    private long id;
    private String questContent;
    public abstract boolean check(Answer ans);
}
