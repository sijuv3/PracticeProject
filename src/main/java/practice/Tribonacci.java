package practice;

public class Tribonacci {

    /*
    * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
    */
    public static void main(String args[]) {
        Tribonacci t = new Tribonacci();
        System.out.println(t.solution(25));
    }

    private int solution(int n) {
        int sum = 0;
        if (n <= 0)
            return 0;
        if (n <= 2)
            return 1;

        int a = 0, b = 1, c = 1;

        while (n > 2) {
            sum = a + b + c;
            a = b; b = c; c = sum;
            n--;
        }

        return sum;
    }
}
