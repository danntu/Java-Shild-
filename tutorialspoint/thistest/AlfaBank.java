package thistest;

public class AlfaBank extends Bank {

    public double percentDep() {
        return 0.13 + 0.01;
    }

    public void showBankName() {
        System.out.println(bankName);
        System.out.println("This is subclass");

    }

    public static void main(String[] args) {
        AlfaBank alfaBank = new AlfaBank();
        alfaBank.bankName = "Alfabank";
        alfaBank.showBankName();


        Bank bank = new Bank();
        bank.showBankName();


    }

}
