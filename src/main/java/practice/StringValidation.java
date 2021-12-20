package practice;

import java.util.Locale;

public class StringValidation {
    public static void main(String args[]) {
        System.out.println(isUpperCase("Hello"));
        System.out.println(isLowerCase("Hello"));
        System.out.println(isUpperCase("HELLO"));
        System.out.println(isLowerCase("hello"));

        System.out.println(isPasswordComplex("Hell0"));

        System.out.println(normalizeString("Hello there, JOHN"));

        parseString("hello");

        System.out.println(isAtEvenIndex("Hello", 'l'));

        System.out.println(reverse("Hey there!"));
    }

    public static boolean isUpperCase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String s) {
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static boolean isPasswordComplex(String s) {
        return s.chars().anyMatch(Character::isUpperCase)
                && s.chars().anyMatch(Character::isLowerCase)
                && s.chars().anyMatch(Character::isDigit);
    }

    public static String normalizeString(String s) {
        return s.toLowerCase().trim().replace(",", "");
    }

    public static void parseString(String s) {
        System.out.println("Option 1:");
        for (char c : s.toCharArray()) {
            System.out.print(c);
        }
        System.out.println("\nOption 2:");
        for (int i=0; i<s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println("");
    }

    public static boolean isAtEvenIndex(String s, char item) {
        if (s == null || s.isEmpty())
            return false;
        for (int i = 0; i < s.length() / 2 + 1; i = i+2) {          // Since looking for even index, we can add i by 2, and look for half the iteration
            if (s.charAt(i) == item)
                return true;
        }
        return false;
    }

    public static String reverse(String s) {
        if (s == null || s.isEmpty())
            return s;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String reverse2(String s) {
        if (s == null || s.isEmpty())
            return s;
        StringBuilder sb = new StringBuilder();
        return sb.reverse().toString();
    }
}
