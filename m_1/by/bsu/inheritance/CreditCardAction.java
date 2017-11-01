package m_1.by.bsu.inheritance;

public class CreditCardAction extends AbstractCardAction{
    public boolean checkCreditLimit(){
        return  true;
    }

    @Override
    public void doPayment(double amountPayment) {
        System.out.println("complete from credit card");
    }
}
