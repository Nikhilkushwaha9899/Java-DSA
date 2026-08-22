public class LCIS {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0)
            return 0;
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 2, 2, 2 };
        LCIS l = new LCIS();
        System.out.println(l.findLengthOfLCIS(nums));
    }
}
