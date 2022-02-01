package dynamic;

/*
 * https://leetcode.com/problems/fibonacci-number/
 */
public class Fibonacci {

    public static void main(String args[]) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.solution(4));
        System.out.println(f.solution2(4));
        System.out.println(f.solution3(4));
        System.out.println(f.solution4(4));
    }

    /*
     * Solution 1: Iterative
     */
    private int solution(int n) {
        int sum = 0;

        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0; int b = 1;

        while (n > 1) {
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }
        return sum;
    }

    /*
     * Solution 2: Recursive
     */
    private int solution2(int n) {
        if (n <= 1)
            return n;
        else
            return solution2(n - 1) + solution2(n - 2);
    }

    /*
     * Solution 3: Dynamic Programming - Top Down Approach
     */
    private int solution3(int n) {
        int[] fib_cache = new int[31];
        if (n <= 1)
            return n;
        else if (fib_cache[n] != 0)
            return fib_cache[n];
        else
            return fib_cache[n] = solution3(n - 1) + solution3(n - 2);
    }

    /*
     * Solution 4: Dynamic Programming - Bottom Up Approach
     */
    private int solution4(int n) {
        if (n <= 1)
            return n;

        int[] fib_cache = new int[n + 1];
        fib_cache[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib_cache[i] = fib_cache[i - 1] + fib_cache[i - 2];
        }
        return fib_cache[n];
    }
}
