import java.util.ArrayList;
import java.util.List;

public class Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
		List<Integer> l = new ArrayList<>();
		for (int i : nums) {
			l.add(i);
		}
		int ptr1 = 0;
		int ptr2 = 1;
		int count = 1;
		while (ptr2 < l.size()) {
			if (l.get(ptr1).equals(l.get(ptr2))) {
				count++;
				if (count > 2) {
					l.remove(ptr2);
				} else {
					ptr1++;
					ptr2++;
				}
			} else {
				count = 1;
				ptr1++;
				ptr2++;
			}
		}
		for(int i = 0; i < l.size(); i++){
			nums[i]=l.get(i);
		}
		return l.size();
	}
    public static void main(String[] args) {
        Remove_Duplicates_from_Sorted_Array_II rd2 = new Remove_Duplicates_from_Sorted_Array_II();
        int nums[] = { 1,1,1,2,2,3};
		System.out.println(rd2.removeDuplicates(nums));
    }
}
