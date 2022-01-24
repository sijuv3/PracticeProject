package practice;

import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        IntersectionOfArrays ia = new IntersectionOfArrays();
        System.out.println(Arrays.toString(ia.intersect(new int[]{4, 9, 5, 9}, new int[]{9, 4, 9, 8, 4})));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return intersect(nums2, nums1);

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                list.add(num);
                map.put(num, count - 1);
            }
        }

        // Add list entries to an array and return
        int[] result = new int[list.size()];
        int i = 0;
        for (int num : list) {
            result[i++] = num;
        }

        // Or convert to array as below, supported in java 8
        int[] res = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return result;
    }
}
