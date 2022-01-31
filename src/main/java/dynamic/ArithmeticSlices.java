package dynamic;

public class ArithmeticSlices {
    public static void main(String[] args) {
        ArithmeticSlices as = new ArithmeticSlices();
        System.out.println(as.numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
        System.out.println(as.numberOfArithmeticSlices(new int[]{1}));
    }

    public int numberOfArithmeticSlices(int[] nums) {
        int curr = 0, sum = 0;
        for (int i = 2; i < nums.length; i++)
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                curr += 1;
                sum += curr;
            } else {
                curr = 0;
            }
        return sum;
    }
}