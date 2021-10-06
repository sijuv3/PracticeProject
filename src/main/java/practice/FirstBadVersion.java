package practice;

public class FirstBadVersion {
    public static void main(String[] args) {
        FirstBadVersion fbv = new FirstBadVersion();
        fbv.solution(5);
    }

    public int solution(int n) {
        int left = 0;
        int right = n;

        while (left < right) {
            int midpoint = left + (right - left) / 2;
            if (isBadVersion(midpoint))
                right = midpoint;
            else
                left = midpoint + 1;
        }

        if (left == right && isBadVersion(left))
            return left;

        return -1;
    }

    public boolean isBadVersion(int midpoint) {
        return false;
    }
}
