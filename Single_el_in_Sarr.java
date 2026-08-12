public class Single_el_in_Sarr {
    public int singleNonDuplicate(int[] nums) {
        int ptr1 = 0;
        int ptr2 = 1;
        while (ptr2 < nums.length) {
            if (nums[ptr1] != nums[ptr2]) {
                return nums[ptr1];
            }
            ptr1 += 2;
            ptr2 += 2;
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        Single_el_in_Sarr seia = new Single_el_in_Sarr();
        int nums[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };
        System.out.println(seia.singleNonDuplicate(nums));
    }
}