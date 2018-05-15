package javatpoint.str;

import java.text.DecimalFormat;

public class CharacterPercentage {
    static void charPercentage(String input) {
        int totalChar = input.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int others = 0;
        int whitespace = 0;
        for (int i = 0; i < totalChar; i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                whitespace++;
            } else {
                others++;
            }
        }
        double upperCaseLetterPercentage = (upperCase * 100) / totalChar;
        double lowerCaseLetterPercentage = (lowerCase * 100) / totalChar;
        double digitsPercentage = (digits * 100) / totalChar;
        double otherCharPercentage = (others * 100) / totalChar;
        double whitespacePercentage = (whitespace * 100) / totalChar;

        DecimalFormat format = new DecimalFormat("##.##");
        System.out.println("In strring " + input + ":");
        System.out.println("Uppercase letters are " + format.format(upperCaseLetterPercentage) + "%");
        System.out.println("Uppercase letters count " + format.format(upperCase));

        System.out.println("Lowercase letters are " + format.format(lowerCaseLetterPercentage) + "%");
        System.out.println("Lowercase letters count " + format.format(lowerCase));

        System.out.println("Digits are " + format.format(digitsPercentage) + "%");
        System.out.println("Digits count " + format.format(digits));

        System.out.println("Whitespace are " + format.format(whitespacePercentage) + "%");
        System.out.println("Whitespace count " + format.format(whitespace));

        System.out.println("Other characters are " + format.format(otherCharPercentage) + "%");
        System.out.println("Other character count " + format.format(others));
    }

    public static void main(String[] args) {
        charPercentage("Kazakhstan is my country 100%");
    }
}
