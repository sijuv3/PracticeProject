package practice;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new ReverseInteger().solution(-123));
    }

    public int solution(int x) {
        boolean sign = x < 0;
        x = Math.abs(x);
        int res = 0;
        while (x > 0) {
            if (res > Integer.MAX_VALUE / 10)
                return 0;
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return sign ? -res : res;
    }
}
