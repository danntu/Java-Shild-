package javatpoint.inter;

interface Bank {
    float rateOfInterest();
}

class SBI implements Bank {
    @Override
    public float rateOfInterest() {
        return 9.15f;
    }
}

class PNB implements Bank {
    @Override
    public float rateOfInterest() {
        return 9.7f;
    }
}

public class TestInterface2 {
    public static void main(String[] args) {
        Bank bank = new SBI();
        System.out.println("SBI " + bank.rateOfInterest());
        bank = new PNB();
        System.out.println("PNB " + bank.rateOfInterest());
    }
}
