package practice;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        IntersectionOfArrays ii = new IntersectionOfArrays();
        System.out.println(Arrays.toString(ii.intersect(new int[]{4, 9, 5, 9}, new int[]{9, 4, 9, 8, 4})));
        System.out.println(Arrays.toString(ii.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i))
                intersection.add(i);
        }

        int[] result = new int[intersection.size()];
        int index = 0;
        for (int i : intersection) {
            result[index] = i;
            index++;
        }

        return result;
    }
}
