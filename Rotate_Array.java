import java.util.Arrays;

public class Rotate_Array {
    public void reverse(int nums[], int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    public static void main(String[] args) {
        Rotate_Array ra = new Rotate_Array();
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        ra.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
