import java.util.*;

public class Third_Max_Num {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new TreeSet<>();
        for (int i : nums) {
            s.add(i);
        }
        int idx = 0;
        int newnums[] = new int[s.size()];
        for (int i : s) {
            newnums[idx++] = i;
        }
        int l = 0, r = newnums.length - 1;
        while (l < r) {
            int temp = newnums[l];
            newnums[l] = newnums[r];
            newnums[r] = temp;
            l++;
            r--;
        }
        if (newnums.length < 3) {
            return newnums[0];
        }
        return newnums[2];
    }

    public static void main(String[] args) {
        Third_Max_Num tmn = new Third_Max_Num();
        int[] nums = new int[] {1 ,2};
        System.out.println(tmn.thirdMax(nums));
    }
}
