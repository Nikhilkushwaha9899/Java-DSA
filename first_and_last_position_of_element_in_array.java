import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class first_and_last_position_of_element_in_array {
    public int[] searchRange(int[] nums, int target) {
        int firstindex = -1;
        int secondindex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if(firstindex == -1){
                firstindex = i;
            }
            secondindex=i;
            }
        }
        return new int[] { firstindex, secondindex };
    }
    public static void main(String[] args) {
        first_and_last_position_of_element_in_array fla=new first_and_last_position_of_element_in_array();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(fla.searchRange(nums, target)));
    }
}
