package practice;

/*
 * https://leetcode.com/problems/powx-n/
 */
public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
        System.out.println(myPow(2.10000, 3));
        System.out.println(myPow(2.00000, -2));
    }

    /*
     * 2^10 = 2^5 * 2^5
     *      = (2 * 2)^5
     *      = (x * x)^n/2
     */
    private static double fastPow(double x, long n) {
        if (n == 0)
            return 1.0;
        if (n == 1)
            return x;
        if (x == 0)
            return 0;
        double half = fastPow(x, n / 2);
        if (n % 2 == 0)
            return half * half;
        else
            return half * half * x;
    }

    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }
}
