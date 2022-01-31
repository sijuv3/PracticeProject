package dynamic;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/triangle/
 */
public class Triangle {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        innerList.add(-10);
        list.add(innerList);
        System.out.println(t.minimumTotal(list));

        list = new ArrayList<>();
        innerList = new ArrayList<>();
        innerList.add(2);
        list.add(innerList);

        innerList = new ArrayList<>();
        innerList.add(3);
        innerList.add(4);
        list.add(innerList);

        innerList = new ArrayList<>();
        innerList.add(6);
        innerList.add(5);
        innerList.add(7);
        list.add(innerList);

        innerList = new ArrayList<>();
        innerList.add(4);
        innerList.add(1);
        innerList.add(8);
        innerList.add(3);
        list.add(innerList);
        System.out.println(t.minimumTotal(list));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                A[j] = Math.min(A[j], A[j + 1]) + triangle.get(i).get(j);
            }
        }
        return A[0];
    }
}
