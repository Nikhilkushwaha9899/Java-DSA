public class House_robber {
    public int rob(int[] nums) {
        int currmoney = 0;
        int prevmoney = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = currmoney;
            currmoney = Math.max(currmoney, prevmoney + nums[i]);
            prevmoney = temp;
        }
        return currmoney;
    }

    public static void main(String[] args) {
        House_robber hr = new House_robber();
        int nums[] = { 400, 1, 1, 400 };
        System.out.println(hr.rob(nums));
    }
}
