public class Rotate_Function {
     public void reverse(int nums[], int l, int r) {
    while (l < r) {
      int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
      l++;
      r--;
    }
  }

  public void rotate(int nums[]) {
    if (nums == null || nums.length == 0) {
      return;
    }
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 1, nums.length - 1);
  }

  public int maxRotateFunction(int[] nums) {

    int res = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = 0; j < nums.length; j++) {
        sum += j * nums[j];
      }
      res = Math.max(sum, res);
      rotate(nums);
    }
    return res;
  }
    public static void main(String[] args) {
        Rotate_Function rf=new Rotate_Function();
        int nums[]={4,3,2,6};
        System.out.println(rf.maxRotateFunction(nums));
    }
}
