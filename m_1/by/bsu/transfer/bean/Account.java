package m_1.by.bsu.transfer.bean;

public class Account {
    public long id;
    private double amount;

    public Account() {
        super();
    }

    public Account(long id) {
        super();
        this.id = id;
    }

    public Account(long id, double amount) {
        super();
        this.id = id;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }
}
