import java.util.*;

public class Max_Prod_Two_Arr {
    public int maxProduct(int[] nums) {
        int product = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                product = Math.max(product, (nums[i] - 1) * (nums[j] - 1));
            }
        }
        return product;
    }

    public static void main(String[] args) {
        Max_Prod_Two_Arr mpta = new Max_Prod_Two_Arr();
        int[] nums = { 1, 5, 4, 5 };
        System.out.println(mpta.maxProduct(nums));
    }
}
