package arrays;

/*
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[]{2, 2, 1}));
    }

    /*
     * This XOR operation works because it's like XORing all the numbers by itself.
     * So if the array is {2,1,4,5,2,4,1} then it will be like we are performing this operation
     * ((2^2)^(1^1)^(4^4)^(5)) => (0^0^0^5) => 5.
     * Hence picking the odd one out (5 in this case).
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
