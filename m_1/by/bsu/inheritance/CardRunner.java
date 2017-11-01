package m_1.by.bsu.inheritance;

public class CardRunner {
    public static void main(String[] args) {
        AbstractCardAction action = new CreditCardAction();
        action.doPayment(100);
        System.out.println("action.checkLimit()="+action.checkLimit());
    }
}
