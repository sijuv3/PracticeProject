package practice;

/*
* Given a sorted array of distinct integers and a target value, return the index if the target is found.
* If not, return the index where it would be if it were inserted in order.
*/
public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        System.out.println(sip.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int midpoint = low + (high - low) / 2;
            if (nums[midpoint] == target)
                return midpoint;
            else if (nums[midpoint] < target)
                low = midpoint + 1;
            else
                high = midpoint - 1;
        }
        return low;
    }
}
