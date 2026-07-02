import java.util.*;
public class Left_right_sumDiff {
    public int[] leftRightDifference(int[] nums) {
        int nums2[] = new int[nums.length];
        int result[] = new int[nums.length];
        nums2[0] = 0;
        if (nums.length == 1)
            
        {
            result[0] = 0;
        }
        // leftsum
        for (int i = 1; i < nums.length; i++) {
            nums2[i] = nums2[i - 1] + nums[i - 1];
        }
        // rightsum
        int nums3[] = new int[nums.length];
        nums3[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            nums3[i] = nums3[i + 1] + nums[i + 1];
        }
        // reuslt
        for (int i = 0; i < nums.length; i++) {
            result[i] += Math.abs(nums2[i] - nums3[i]);
        }

        return result;

    }
    public static void main(String[] args) {
        Left_right_sumDiff lr=new Left_right_sumDiff();
        int nums[] = { 10, 4, 8, 3 };
        System.out.println(Arrays.toString(lr.leftRightDifference(nums)));
    }
}
