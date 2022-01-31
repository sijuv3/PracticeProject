package practice;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

/*
 * https://leetcode.com/problems/letter-case-permutation/
 */
public class LetterCasePermutation {
    public static void main(String[] args) {
        System.out.println(new LetterCasePermutation().letterCasePermutation_BFS("a1b2"));
        System.out.println(new LetterCasePermutation().letterCasePermutation_BFS("3z4"));

        System.out.println(new LetterCasePermutation().letterCasePermutation_DFS("a1b2"));
        System.out.println(new LetterCasePermutation().letterCasePermutation_DFS("3z4"));
    }

    public List<String> letterCasePermutation_BFS(String s) {
        if (s == null)
            return new LinkedList<>();

        Queue<String> queue = new LinkedList<>();
        queue.offer(s);

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                continue;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chs = cur.toCharArray();

                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));

                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }

        return new LinkedList<>(queue);
    }

    public List<String> letterCasePermutation_DFS(String s) {
        if (s == null)
            return new LinkedList<>();

        List<String> res = new LinkedList<>();
        helper(s.toCharArray(), res, 0);
        return res;
    }

    public void helper(char[] chs, List<String> res, int pos) {
        if (pos == chs.length) {
            res.add(new String(chs));
            return;
        }
        if (chs[pos] >= '0' && chs[pos] <= '9') {
            helper(chs, res, pos + 1);
            return;
        }

        chs[pos] = Character.toLowerCase(chs[pos]);
        helper(chs, res, pos + 1);

        chs[pos] = Character.toUpperCase(chs[pos]);
        helper(chs, res, pos + 1);
    }
}
