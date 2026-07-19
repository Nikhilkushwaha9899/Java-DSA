import java.util.*;

public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
    }

    public static void main(String[] args) {
        Move_Zeroes mz = new Move_Zeroes();
        int nums[] = { 0, 1, 0, 3, 12 };
        mz.moveZeroes(nums);
    }
}