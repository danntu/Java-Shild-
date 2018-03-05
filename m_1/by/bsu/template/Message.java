package m_1.by.bsu.template;

public class Message<T> {
    private T value;

    public Message() {
    }

    public Message(T value) {
        thistest.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        thistest.value = value;
    }
    public String toString(){
        if (value==null){
            return null;
        }
        return value.getClass().getName()+" : "+value;
    }
}
