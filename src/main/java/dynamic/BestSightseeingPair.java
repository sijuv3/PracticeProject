package dynamic;

/*
 * https://leetcode.com/problems/best-sightseeing-pair/
 * Get the Max of a[i] + i + a[j] - j
 */
public class BestSightseeingPair {
    public static void main(String[] args) {
        BestSightseeingPair bsp = new BestSightseeingPair();
        System.out.println(bsp.maxScoreSightseeingPair3(new int[]{8, 1, 5, 2, 6}));
        //System.out.println(bsp.maxScoreSightseeingPair3(new int[]{1, 2}));
    }

    public int maxScoreSightseeingPair3(int[] values) {
        int max = 0;
        int sIndex = 0;
        for (int i = 1; i < values.length; i++) {
            int startValue = values[sIndex] + sIndex;       // values[i] + i
            int endValue = values[i] - i;                   // values[j] - j

            max = Math.max(startValue + endValue, max);
            //sIndex = (values[i] + i > values[sIndex] + sIndex) ? i : sIndex;
            if (values[i] + i > values[sIndex] + sIndex)
                sIndex = i;
        }
        return max;
    }
}
