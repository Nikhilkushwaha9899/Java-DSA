import java.util.*;

public class Kth_largest_element {
    public void reverse(int nums[], int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int ans = 0;
        reverse(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            count++;
            if (count == k) {
                ans = nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Kth_largest_element kle = new Kth_largest_element();
        int nums[] = { 3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(kle.findKthLargest(nums, k));
    }
}