package practice;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/combinations/
 */
public class Combinations {
    public static void main(String[] args) {
        System.out.println(new Combinations().combine(4, 2));
        System.out.println(new Combinations().combine(1, 1));
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k > n || k < 0)
            return result;

        if (k == 0) {
            result.add(new ArrayList<>());
            return result;
        }

        result = combine(n - 1, k - 1);
        for (List<Integer> list : result) {
            list.add(n);
        }
        result.addAll(combine(n - 1, k));
        return result;
    }
}
