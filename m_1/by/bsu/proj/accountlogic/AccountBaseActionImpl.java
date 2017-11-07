package m_1.by.bsu.proj.accountlogic;

public class AccountBaseActionImpl implements AccountBaseAction {
    @Override
    public boolean openAccount() {
        return false;
    }

    @Override
    public boolean closeAccount() {
        return false;
    }

    @Override
    public void blocking() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unBlocking() {

    }
}
