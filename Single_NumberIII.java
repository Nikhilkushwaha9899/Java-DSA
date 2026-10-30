import java.util.*;

public class Single_NumberIII {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (map.get(num) == 1) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            return nums;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        Single_NumberIII sn3=new Single_NumberIII();
        int nums[] = {-1,0};
        System.out.println(Arrays.toString(sn3.singleNumber(nums)));
    }
}
