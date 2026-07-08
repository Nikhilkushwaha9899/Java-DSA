import java.util.*;

class Sum_of_distance {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for (List<Integer> list : map.values()) {
            int m = list.size();
            long total = 0;
            for (int idx : list)
                total += idx;
            long leftSum = 0;
            for (int i = 0; i < m; i++) {
                int idx = list.get(i);
                total -= idx;
                long left = (long) idx * i - leftSum;
                long right = total - (long) idx * (m - i - 1);
                ans[idx] = left + right;
                leftSum += idx;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Sum_of_distance sod = new Sum_of_distance();
        int nums[] = { 0, 5, 3 };
        System.out.println(Arrays.toString(sod.distance(nums)));

    }
}