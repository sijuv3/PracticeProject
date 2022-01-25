package practice;

/*
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagaram"));
        System.out.println(va.isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] char_counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_counts[s.charAt(i) - 'a']++;       // increment the count for 1st string char
            char_counts[t.charAt(i) - 'a']--;       // decrement the count for 2nd string char
        }

        for (int count : char_counts) {
            if (count != 0)
                return false;
        }

        return true;
    }
}
