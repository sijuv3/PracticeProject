package practice;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {
    public static void main(String[] args) {
        RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct("a", "b"));
        System.out.println(rn.canConstruct("aa", "ab"));
        System.out.println(rn.canConstruct("aa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!counts.containsKey(c) || counts.get(c) <= 0)
                return false;
            counts.put(c, counts.get(c) - 1);
        }

        return true;
    }
}
