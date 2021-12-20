package practice;

public class PermutationString {
    /*
    * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
    * In other words, return true if one of s1's permutations is the substring of s2.
    */
    public static void main(String[] args) {
        PermutationString ps = new PermutationString();
        ps.checkInclusion("abc", "abc");
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2. length() || s2.length() == 0)
            return false;
        if (s1.length() == 0)
            return true;

        int x = s1.length(), y = s2.length();
        int[] arry1 = new int[26];
        int[] arry2 = new int[26];

        return false;
    }
}
