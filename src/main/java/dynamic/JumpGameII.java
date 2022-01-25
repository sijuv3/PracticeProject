package dynamic;

/*
 * https://leetcode.com/problems/jump-game-ii/
 */
public class JumpGameII {
    public static void main(String[] args) {
        JumpGameII jg = new JumpGameII();
        System.out.println(jg.jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(jg.jump(new int[]{2, 3, 0, 1, 4}));
    }

    public int jump(int[] nums) {
        int begin = 0, end = 0, farthest = 0;
        int jump = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == end) {
                jump++;
                end = farthest;
            }
        }
        return jump;
    }
}
