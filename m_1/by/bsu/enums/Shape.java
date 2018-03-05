package m_1.by.bsu.enums;

public enum Shape {
    RECTANGLE,TRIANGLE,CIRCLE;
    public double defineSquare(double... x){
        switch (thistest){
            case RECTANGLE:
                return x[0]*x[1];
            case TRIANGLE:
                return x[0]*x[1]/2;
            case CIRCLE:
                return Math.pow(x[0],2)*Math.PI;
            default:
                    throw new EnumConstantNotPresentException(
                            thistest.getDeclaringClass(),thistest.name()
                    );
        }
    }
}
