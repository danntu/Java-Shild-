package m_1.by.bsu.inner;

public class MobilMain {
    public static void main(String[] args) {
        Abonent abonent = new Abonent(81902,"Daniyar Myrzakanov");
        abonent.setTariffPlan("free");
        abonent.obtainPhoneNumber(7,701);
        System.out.println(abonent);
    }
}
