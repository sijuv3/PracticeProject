package dynamic;

/*
 * https://leetcode.com/problems/trapping-rain-water/
 * https://leetcode.com/problems/trapping-rain-water/Figures/42/trapping_rain_water.png
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater trw = new TrappingRainWater();
        //System.out.println(trw.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(trw.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }

    public int trap(int[] height) {
        int a = 0;
        int b = height.length - 1;
        int max = 0;
        int leftmax = 0;
        int rightmax = 0;
        while (a <= b) {
            leftmax = Math.max(leftmax, height[a]);
            rightmax = Math.max(rightmax, height[b]);
            if (leftmax < rightmax)
                max += leftmax - height[a++];       // leftmax is smaller than rightmax, so the (leftmax-A[a]) water can be stored
            else
                max += rightmax - height[b--];
        }
        return max;
    }
}
