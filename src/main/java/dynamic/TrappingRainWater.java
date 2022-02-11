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
        int left = 0, right = height.length - 1;
        int trappedWater = 0;
        int leftmax = 0, rightmax = 0;
        while (left <= right) {
            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);
            if (leftmax < rightmax)
                trappedWater += leftmax - height[left++];       // leftmax is smaller than rightmax, so the (leftmax-A[a]) water can be stored
            else
                trappedWater += rightmax - height[right--];
        }
        return trappedWater;
    }
}
