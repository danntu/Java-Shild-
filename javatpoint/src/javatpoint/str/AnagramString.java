package javatpoint.str;

import java.util.Arrays;

public class AnagramString {
    public static void isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");

        boolean status = true;

        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char ch1[] = str1.toLowerCase().toCharArray();
            char ch2[] = str2.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            status = Arrays.equals(ch1, ch2);
        }

        if (status) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }

    }

    public static void main(String[] args) {
        isAnagram("Keep", "Peek");
        isAnagram("Danik", "KaniD");
        isAnagram("Dako", "Akon");
    }
}
