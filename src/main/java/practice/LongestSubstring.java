package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    /*
     * Given a string s, find the length of the longest substring without repeating characters.
     * Example 1:
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     */
    public static void main(String args[]) {
        LongestSubstring l = new LongestSubstring();
        System.out.println(l.solution1("abcabcbb"));
    }

    private int solution1(String s) {
        int max = 0;
        int a_pointer = 0; // pointer at the beginning or first char
        int b_pointer = 0; // pointer which keeps moving/sliding to the right
        Set<Character> charSet = new HashSet<>();

        while (b_pointer < s.length()) {
            if (!charSet.contains(s.charAt(b_pointer))) {
                charSet.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(charSet.size(), max);
            } else {
                charSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }

        return max;
    }

    private int solution2(String s) {
        if (s.length() == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i=0, j=0; i<s.length(); ++i) {
            if (map.containsKey(s.charAt(i)))
                j = Math.max(j,map.get(s.charAt(i))+1);

            map.put(s.charAt(i), i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}
