package m_1.by.bsu.fund.run;

import m_1.by.bsu.fund.action.CompareCoin;
import m_1.by.bsu.fund.bean.Coin;

public class Runner {
    public static void main(String[] args) {
        Coin ob1 = new Coin();
        ob1.setDiameter(-0.11);
        ob1.setDiameter(0.12);
        ob1.setWeigth(150);

        Coin ob2 = new Coin();
        ob2.setDiameter(0.21);
        ob2.setWeigth(170);
        CompareCoin cc = new CompareCoin();
        cc.compareDiameter(ob1,ob2);
        }
}
