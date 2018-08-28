package java8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterReflection {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        Class aClass = calculate.getClass();

        Method[] methods = aClass.getDeclaredMethods();

        for (Method method :
                methods) {
            System.out.print(method.getName());

            Parameter[] parameters = method.getParameters();
            for (Parameter parameter :
                    parameters) {
                System.out.print(" " + parameter.getParameterizedType());
                System.out.print(" " + parameter.getName());
            }
            System.out.println();
        }
    }
}
