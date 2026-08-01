import java.util.*;

public class Intersection_Of_Tarr2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                l.add(nums1[i]); 
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int arr[] = new int[l.size()];
        for (int x = 0; x < arr.length; x++) {
            arr[x] += l.get(x);
        }
        return arr;
    }

    public static void main(String[] args) {
        Intersection_Of_Tarr2 iot2 = new Intersection_Of_Tarr2();
        int nums1[] = { 1, 2, 2, 1 };
        int nums2[] = { 2, 2 };
        System.out.println(Arrays.toString(iot2.intersection(nums1, nums2)));
    }

}
