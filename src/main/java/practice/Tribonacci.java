package practice;

public class Tribonacci {

    public static void main(String args[]) {
        Tribonacci t = new Tribonacci();
        System.out.println(t.solution(25));
    }

    private int solution(int n) {
        int sum = 0;
        if (n <= 0) return 0;
        if (n <= 2) return 1;

        int a = 0, b = 1, c = 1;

        while (n >= 3) {
            sum = a + b + c;
            a = b; b = c; c = sum;
            n--;
        }

        return sum;
    }
}
