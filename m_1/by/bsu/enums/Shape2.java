package m_1.by.bsu.enums;

public enum Shape2 {
    RECTANGLE,SQUARE,TRIANGLE{
        public double computeSquare(){
            return thistest.getA()*thistest.getB()/2;
        }
    };

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public void setShape(double a, double b){
        if ((a<=0 || b<=0) || a!=b && thistest==SQUARE){
            throw new IllegalArgumentException();
        }
        thistest.a = a;
        thistest.b = b;
    }
    public double computeSquare(){
        return a*b;
    }
    public String toString(){
        return name()+"-> a="+a+", b="+b;
    }
}
