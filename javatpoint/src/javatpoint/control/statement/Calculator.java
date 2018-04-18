package javatpoint.control.statement;

import org.jetbrains.annotations.Contract;

/**
 * The Calculator class provides methods to get addition and subtraction of given 2 numbers.
 */
public class Calculator {
    /**
     * The add() method returns addition of given numbers.
     */
    @Contract(pure = true)
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * The sub() method returns subtraction of given numbers.
     */
    @Contract(pure = true)
    public static int sub(int a, int b) {
        return a - b;
    }
}