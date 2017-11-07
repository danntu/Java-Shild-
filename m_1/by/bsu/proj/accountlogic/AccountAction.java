package m_1.by.bsu.proj.accountlogic;

public interface AccountAction {
    boolean openAccount();
    boolean cloaseAccount();
    void blocking();
    void unBlocking();
    double depositInCash(int accountNumber, int amount);
    boolean withdraw(int accountNumber, int amount);
    boolean convert(double amount);
    boolean transfer(double amount);
}
