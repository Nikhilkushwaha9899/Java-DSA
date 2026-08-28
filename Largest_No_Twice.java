import java.util.*;
public class Largest_No_Twice {
    public int dominantIndex(int[] nums) {
		List<Long> l = new ArrayList<>();
		int target = nums[0];
		int idx = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > target) {
				target = nums[i];
				idx = i;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != target) {
				l.add((long) nums[i]);
			}
		}
		for (int i = 0; i < l.size(); i++) {
			if (!(target >= 2L * l.get(i))) {
				return -1;
			}
		}
		return idx;
	}
    public static void main(String[] args) {
        Largest_No_Twice lnt=new Largest_No_Twice();
        int nums[] = { 100, 51, 1 };
        System.out.println(lnt.dominantIndex(nums));
    }
}
