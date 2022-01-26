package dynamic;

public class MaximumLengthOfSubarrayWithPositiveProduct {
    public static void main(String[] args) {
        MaximumLengthOfSubarrayWithPositiveProduct m = new MaximumLengthOfSubarrayWithPositiveProduct();
        System.out.println(m.getMaxLen(new int[]{1, -2, -3, 4}));
        System.out.println(m.getMaxLen(new int[]{0, 1, -2, -3, -4}));
        System.out.println(m.getMaxLen(new int[]{-1, -2, -3, 0, 1}));
    }

    /*
     * Algorithm:
     * 1. If we see a 0, we gotta start off things again
     * 2. If we see a positive number :
     *      2.1. Increase length of positive mutilpicative result till now.
     *      2.2. Increase length of negative mutilpicative result till now, unless we had not encountered any negative before.
     * 3. If we see a negative number:
     *      3.1. It's time to swap positive and negative multiplicative results' lengths and do similar task as we did in above case.
     * 4. In each iteration, use the length of positive mutilpicative result to compute answer.
     */
    public int getMaxLen(int[] nums) {
        int positive = 0, negative = 0;    // length of positive and negative results
        int ans = 0;
        for (int x : nums) {
            if (x == 0)  {
                positive = 0;
                negative = 0;
            } else if (x > 0) {
                positive++;
                negative = negative == 0 ? 0  : negative + 1;
            } else {
                int temp = positive;
                positive = negative == 0 ? 0  : negative + 1;
                negative = temp + 1;
            }
            ans = Math.max(ans, positive);
        }
        return ans;
    }
}
