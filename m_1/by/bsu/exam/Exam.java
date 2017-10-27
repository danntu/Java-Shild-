package m_1.by.bsu.exam;

public class Exam <T extends Number> {
    private String name;
    private T mark;

    public Exam(String name, T mark) {
        this.name = name;
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }
    private int roundMark(){
        return  Math.round(mark.floatValue());
    }
    public boolean equalsToMark(Exam<T> ob){
        return roundMark() == ob.roundMark();
    }
}
