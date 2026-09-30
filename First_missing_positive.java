import java.util.*;

public class First_missing_positive {
    public int firstMissingPositive(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i < nums.length + 1; i++) {
            l.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < l.size(); j++) {
                if (nums[i] == l.get(j)) {
                    l.remove(j);
                    break;
                }
            }
        }
        if (l.isEmpty()) {
            return nums.length + 1;
        }

        return l.get(0);
    }

    public static void main(String[] args) {
        First_missing_positive fms = new First_missing_positive();
        int nums[] = { 3, 4, -1, 1, 1, 2 };
        System.out.println(fms.firstMissingPositive(nums));
    }
}