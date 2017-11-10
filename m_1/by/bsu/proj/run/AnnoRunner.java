package m_1.by.bsu.proj.run;

import m_1.by.bsu.proj.accountlogic.AccountBaseAction;
import m_1.by.bsu.proj.accountlogic.AccountOperationManager;
import m_1.by.bsu.proj.annotation.AccountOperationManagerImpl;
import m_1.by.bsu.proj.annotation.logic.SecurityFactory;

public class AnnoRunner {
    public static void main(String[] args) {
        AccountOperationManager account = new AccountOperationManagerImpl();
        AccountOperationManager securityAccount = SecurityFactory.createSecurityObject(account);
        securityAccount.depositInCash(10128336,6);
        securityAccount.withdraw(64092376,2);
    }
}
