package javatpoint.polymorphism.runtime;

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Bank bank;
        bank = new SBI();
        System.out.println("SBI Rate of interest: " + bank.getRateOfInterest());

        bank = new ICICI();
        System.out.println("ICICI Rate of interest: " + bank.getRateOfInterest());

        bank = new AXIS();
        System.out.println("AXIS Rate of interest: " + bank.getRateOfInterest());

    }
}
