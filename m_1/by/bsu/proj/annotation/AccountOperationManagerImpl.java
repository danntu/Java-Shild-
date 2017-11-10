package m_1.by.bsu.proj.annotation;

import m_1.by.bsu.proj.accountlogic.AccountOperationManager;

public class AccountOperationManagerImpl implements AccountOperationManager {
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    public double depositInCash(int accountNumber, int amount) {
        return 0;
    }
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    @Override
    public boolean withdraw(int accountNumber, int amount) {
        return true;
    }
    @BankingAnnotation(securityLevel = SecurityLevelEnum.LOW)
    @Override
    public boolean convert(double amount) {
        return true;
    }
    @BankingAnnotation
    @Override
    public boolean transfer(int accountNumber, double amount) {
        return true;
    }
}
