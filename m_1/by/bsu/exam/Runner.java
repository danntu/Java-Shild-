package m_1.by.bsu.exam;

public class Runner {
    public static void main(String[] args) {
        Exam<Double> md1 = new Exam<Double>("Progr",71.41D);
        Exam<Double> md2 = new Exam<Double>("Progr",71.45D);
        System.out.println(md1.equalsToMark(md2));

    }
}
