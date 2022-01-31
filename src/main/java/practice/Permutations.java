package practice;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/permutations/
 */
public class Permutations {
    public static void main(String[] args) {
        System.out.println(new Permutations().permute(new int[]{1, 2, 3}));
        System.out.println(new Permutations().permute(new int[]{0, 1}));
        System.out.println(new Permutations().permute(new int[]{1}));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length == 0)
            return ans;
        List<Integer> l0 = new ArrayList<>();
        l0.add(nums[0]);
        ans.add(l0);

        for (int i = 1; i < nums.length; ++i) {
            List<List<Integer>> new_ans = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                for (List<Integer> l : ans) {
                    List<Integer> new_l = new ArrayList<>(l);
                    new_l.add(j, nums[i]);
                    new_ans.add(new_l);
                }
            }
            ans = new_ans;
        }
        return ans;
    }
}
