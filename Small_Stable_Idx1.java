public class Small_Stable_Idx1 {
    public int max(int i, int nums[]) {
        int mx = nums[0];
        for (int x = 0; x < i; x++) {
            if (nums[x] > mx) {
                mx = nums[x];
            }
        }
        return mx;
    }

    public int min(int i, int nums[]) {
        int mn = nums[i];
        for (int x = i; x < nums.length; x++) {
            if (nums[x] < mn) {
                mn = nums[x];
            }
        }
        return mn;
    }

    public int firstStableIndex(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (max(i, nums) - min(i, nums) <= k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Small_Stable_Idx1 ssi = new Small_Stable_Idx1();
        int nums[] = { 48963,48967,48963,48963,48960,48955,48951,48953,48958,48960,48962,48967,48966,48970,48975,48970,48970 };
        int k = 2;
        System.out.println(ssi.firstStableIndex(nums, k));
    }
}