package m_1.by.bsu.enums;

import sun.security.provider.SHA;

public class EnumRunner {
    public static void main(String[] args) {
        int i = 4;
        for(Shape2 f: Shape2.values()){
            f.setShape(3,i--);
            System.out.println(f+" площадь "+f.computeSquare());
        }
    }
}
