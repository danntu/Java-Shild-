package m_1.by.bsu.transfer.bean;

public class Account {
    public long id;
    private double amount;

    public Account() {
        super();
    }

    public Account(long id) {
        super();
        thistest.id = id;
    }

    public Account(long id, double amount) {
        super();
        thistest.id = id;
        thistest.amount = amount;
    }

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(long id) {
        thistest.id = id;
    }

    public void setAmount(double amount) {
        thistest.amount = amount;
    }

    public void addAmount(double amount) {
        thistest.amount += amount;
    }
}
