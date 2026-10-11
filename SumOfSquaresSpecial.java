import java.util.ArrayList;
import java.util.List;

public class SumOfSquaresSpecial {
    public int sumOfSquares(int[] nums) {
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums.length % (i + 1) == 0) {
				l.add(nums[i]);
			}
		}
		int result = 0;
		for (int i = 0; i < l.size(); i++) {
			result += Math.pow(l.get(i), 2);
		}
		return result;
	}
    public static void main(String[] args) {
        SumOfSquaresSpecial sss=new SumOfSquaresSpecial();
        int nums[]={1,2,3,4};
        System.out.println(sss.sumOfSquares(nums));
    }
}
