package m_1.by.bsu.proj.accountlogic;

public interface AccountBaseAction {
    boolean openAccount();
    boolean closeAccount();
    void blocking();
    void unBlocking();
}
