import java.util.*;

public class Finad_all_dupl {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 2) {
                l.add(entry.getKey());
            }
        }
        return l;
    }
    public static void main(String[] args) {
        Finad_all_dupl fad=new Finad_all_dupl();
        int nums[]={4,3,2,7,8,2,3,1};
        System.out.println(fad.findDuplicates(nums));
    }
}
