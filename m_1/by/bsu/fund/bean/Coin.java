package m_1.by.bsu.fund.bean;

public class Coin {
    private double diameter;
    private double weight;
    public double getDiameter(){
        return diameter;
    }

    public void setDiameter(double value){
        if (value>0) {
            diameter=value;
        } else{
            System.out.println("Отрицательный диаметр");
        }

    }
    public double takeWeight(){
        return weight;
    }
    public void setWeigth(double value){
        weight=value;
    }
}
