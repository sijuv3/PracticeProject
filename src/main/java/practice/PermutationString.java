package practice;

/*
 * https://leetcode.com/problems/permutation-in-string/
 */
public class PermutationString {
    /*
    * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
    * In other words, return true if one of s1's permutations is the substring of s2.
    */
    public static void main(String[] args) {
        PermutationString ps = new PermutationString();
        System.out.println(ps.checkInclusion("ab", "eidbaooo"));
        System.out.println(ps.checkInclusion("ab", "eidboaoo"));

        System.out.println(ps.checkInclusion2("ab", "eidbaooo"));
        System.out.println(ps.checkInclusion2("ab", "eidboaoo"));
    }

    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;

        int[] count = new int[26];
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count)) return true;

        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if (allZero(count)) return true;
        }

        return false;
    }

    private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }

    public boolean checkInclusion2(String s1, String s2) {
        int[] count = new int[128];
        for(int i = 0; i < s1.length(); i++)
            count[s1.charAt(i)]--;
        for(int j = 0, r = 0; r < s2.length(); r++) {
            if (++count[s2.charAt(r)] > 0)
                while(--count[s2.charAt(j++)] != 0) { /* do nothing */}
            else if ((r - j + 1) == s1.length())
                return true;
        }
        return s1.length() == 0;
    }
}
