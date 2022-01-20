package practice;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray ms = new MergeSortedArray();
        System.out.println(Arrays.toString(ms.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3)));
        System.out.println(Arrays.toString(ms.merge(new int[]{1}, 1, new int[]{}, 0)));
        System.out.println(Arrays.toString(ms.merge(new int[]{0}, 0, new int[]{1}, 1)));
    }

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2])
                nums1[i--] = nums1[p1--];
            else
                nums1[i--] = nums2[p2--];
        }
        return nums1;
    }
}
