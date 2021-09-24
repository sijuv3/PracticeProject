package practice;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(Arrays.toString(rs.solution(new char[]{'h', 'e', 'l', 'l', 'o'})));
    }

    private char[] solution(char[] s) {
        int a_pointer = 0, b_pointer = s.length - 1;
        while (a_pointer <= b_pointer) {
            char temp = s[a_pointer];
            s[a_pointer] = s[b_pointer];
            s[b_pointer] = temp;

            a_pointer += 1;
            b_pointer -= 1;
        }
        return s;
    }
}
