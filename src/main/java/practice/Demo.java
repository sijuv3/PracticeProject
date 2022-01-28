package practice;

public class Demo {
    public static void main(String args[]) {
        System.out.println("Hello World");

        Demo demo = new Demo();
        System.out.println(demo.test(new int[]{-1, 0, 3, 5, 9, 12}, 5));
    }

    public int test(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid -1;
        }
        return -1;
    }
}

