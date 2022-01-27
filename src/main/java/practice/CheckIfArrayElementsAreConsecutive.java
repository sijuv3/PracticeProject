package practice;

public class CheckIfArrayElementsAreConsecutive {

    public static void main(String args[]) {
        int input[] = {76, 78, 75, 77, 73, 74};
        CheckIfArrayElementsAreConsecutive cia = new CheckIfArrayElementsAreConsecutive();
        System.out.println(cia.areConsecutive(input));
    }

    /*
    * The idea is to check for the following two conditions. If the following two conditions are true, then return true.
    * 1) max – min + 1 = n where max is the maximum element in the array, min is the minimum element in the array and n is the number of elements in the array.
    * 2) All elements are distinct.
    * To check if all elements are distinct, we can create a visited[] array of size n. We can map the ith element of input array arr[] to the visited array by using arr[i] – min as the index in visited[].
    */
    public boolean areConsecutive(int input[]) {
        int min = Integer.MAX_VALUE;
        // sort the array first.
        for (int i = 0; i < input.length; i++) {
            if (input[i] < min)
                min = input[i];
        }
        for (int i = 0; i < input.length; i++) {
            if (Math.abs(input[i]) - min >= input.length)
                return false;
        }
        return true;
    }
}
