package dynamic;

/*
 * This is a basic fibonacci series problem.
 * f(n) = f(n-1) + f(n-2)
 *
 * https://leetcode.com/problems/climbing-stairs/
 * https://www.youtube.com/watch?v=CFQk7OQO_xM
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs1(2));
        System.out.println(cs.climbStairs1(3));
        System.out.println(cs.climbStairs2(4));
        System.out.println(cs.climbStairs2(5));
    }

    /*
     * Complexity : Time: O(n) ; Space: O(n)
     */
    public int climbStairs1(int n) {
        int[] steps = new int[n+1];
        steps[0] = 1;
        steps[1] = 1;
        for (int i = 2; i <= n; i++) {
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[n];
    }

    /*
     * Complexity : Time: O(2^n) ; Space: O(n)
     */
    public int climbStairs2(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n ==2)
            return 2;
        return climbStairs2(n-1) + climbStairs2(n-2);
    }
}
