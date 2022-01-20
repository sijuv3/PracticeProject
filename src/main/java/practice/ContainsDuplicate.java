package practice;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate1(new int[]{1, 2, 3, 1}));
        System.out.println(cd.containsDuplicate2(new int[]{1, 2, 3, 1}));
    }

    public boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i=0; i < nums.length; i++) {
            if (numbers.contains(nums[i]))
                return true;
            else
                numbers.add(nums[i]);
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}
