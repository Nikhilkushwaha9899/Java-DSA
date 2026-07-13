import java.util.*;

public class H_Index_II {
    public int hIndex(int[] citations) {
        int count = 0;
        int nums[] = new int[citations.length];
        int ptr1 = 0;
        int ptr2 = citations.length - 1;
        int i = 0;
        if (citations.length == 1 && citations[0] == 0) {
            return count;
        }
        while (ptr2 >= ptr1) {
            nums[i] = citations[ptr2];
            i++;
            ptr2--;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > j) {
                count = j + 1;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        H_Index_II hi2 = new H_Index_II();
        int citations[] = {1};
        System.out.println(hi2.hIndex(citations));
    }

}
