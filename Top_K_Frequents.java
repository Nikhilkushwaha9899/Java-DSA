import java.util.*;

public class Top_K_Frequents {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        int res[] = new int[k];
        List<Integer> l = new ArrayList<>(m.keySet());
        Collections.sort(l, (a, b) -> m.get(b) - m.get(a));
        for (int i = 0; i < k; i++) {
            res[i] = l.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Top_K_Frequents tkf = new Top_K_Frequents();
        int nums[] = { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 };
        int k = 2;
        System.out.println(Arrays.toString(tkf.topKFrequent(nums, k)));
    }
}
