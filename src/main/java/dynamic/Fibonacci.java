package dynamic;

public class Fibonacci {

    public static void main(String args[]) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.solution(4));
    }

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
}
