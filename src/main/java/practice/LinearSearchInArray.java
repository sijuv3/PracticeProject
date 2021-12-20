package practice;

import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearchInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch1(arr, 1));
        linearSearch2(arr, 1).ifPresent(System.out::println);
        linearSearch2(arr, 9).ifPresent(System.out::println);
    }

    public static Integer linearSearch1(int[] arr, int item) {
        for (int current : arr) {
            if (current == item)
                return current;
        }
        return null;
    }

    public static OptionalInt linearSearch2(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }
}
