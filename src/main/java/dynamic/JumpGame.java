package dynamic;

public class JumpGame {
    public static void main(String[] args) {
        JumpGame jg = new JumpGame();
        System.out.println(jg.canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(jg.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    public boolean canJump(int[] nums) {
        int lastGoodIndexPosition = nums.length - 1;
        for (int i = nums.length -1; i >= 0; i--) {
            if (i + nums[i] >= lastGoodIndexPosition)
                lastGoodIndexPosition = i;
        }
        return lastGoodIndexPosition == 0;
    }
}
