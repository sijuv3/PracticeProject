import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     */
    public static void main(String args[]) {
        int[] arr = new int[]{3, 2, 4, 1, 6, 5};
        int target = 10;
        System.out.println("Naive: " + Arrays.toString(naiveSolution(arr, target)));
        System.out.println("Optimal: " + Arrays.toString(optimalSolution(arr, target)));
    }

    static int[] naiveSolution(int[] arr, int target) {
        for (int i=0; i< arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    static int[] optimalSolution(int[] arr, int target) {
        final Map<Integer, Integer> processedNum = new HashMap<Integer, Integer>();

        for (int i=0; i<arr.length; i++) {
            int compliment = target - arr[i];
            if (processedNum.containsKey(compliment)) {
                return new int[] {processedNum.get(compliment), i};
            } else {
                processedNum.put(arr[i], i);
            }
        }
        return new int[]{};
    }
}
