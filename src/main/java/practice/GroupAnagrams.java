package practice;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams_solByCount(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagramsTest(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    /*
     * Time Complexity: O(NK log K), where N is the length of strs, and K is the maximum length of a string in strs.
     * The outer loop has complexity O(N) as we iterate through each string.
     * Then, we sort each string in O(K log K) time.
     *
     * Space Complexity: O(NK), the total information content stored in ans.
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList<>();
        Map<String, List> ans = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key))
                ans.put(key, new ArrayList<>());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

    /*
     * Time Complexity: O(NK), where N is the length of strs, and K is the maximum length of a string in strs.
     * Counting each string is linear in the size of the string, and we count every string.
     *
     * Space Complexity: O(NK), the total information content stored in ans.
     */
    public static List<List<String>> groupAnagrams_solByCount(String[] strs) {
        if (strs.length == 0)
            return new ArrayList();
        Map<String, List> ans = new HashMap<>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray())
                count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                //sb.append('#');
                sb.append(count[i]);
            }

            String key = sb.toString();
            if (!ans.containsKey(key))
                ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

    public static List<List<String>> groupAnagramsTest(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray())
                ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr))
                map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
