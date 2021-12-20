package practice;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 1, 2, 3};
        System.out.println(s.search(nums, 7));
    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        int left = 0;
        int right = nums.length - 1;

        // find the index of the smallest value using binary search, once the loop breaks left will have the index of the smallest element.
        // Loop will terminate since mid < right, and left or right will shrink by at least 1.
        while (left < right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] > nums[right])
                left = midpoint + 1;
            else
                right = midpoint;
        }

        int start = left;
        left = 0;
        right = nums.length - 1;

        // find which side of the array to do search
        if (target >= nums[start] && target <= nums[right])
            left = start;
        else
            right = start;

        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target)
                return midpoint;
            else if (nums[midpoint] < target)
                left = midpoint + 1;
            else
                right = midpoint - 1;
        }

        return -1;
    }
}
