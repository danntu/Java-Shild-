package javatpoint.str;

public class TestPalindrome {
    public static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String rev = stringBuilder.toString();
        if (str.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("mam"));
        System.out.println(isPalindrome("test"));
    }
}
