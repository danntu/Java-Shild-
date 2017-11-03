package m_1.by.bsu.inner.study;

public abstract class AbstractTeacher {
    private int id;

    public AbstractTeacher(int id) {
        this.id = id;
    }

    public abstract boolean excludeStudent(String name);
}
