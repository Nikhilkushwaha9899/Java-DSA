import java.util.*;

public class FInd_target_after_sorting {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                l.add(i);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        FInd_target_after_sorting ftas = new FInd_target_after_sorting();
        int nums[] = { 1, 2, 5, 2, 3 };
        int target = 2;
        System.out.println(ftas.targetIndices(nums, target));
    }
}