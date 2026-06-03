import java.util.Scanner;

public class Search_in_a_rotated_sorted_array {
 public int search(int[] nums, int target) {
        int n =nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Search_in_a_rotated_sorted_array sa = new Search_in_a_rotated_sorted_array();
        int m = sc.nextInt();
        int nums[]=new int[m];
        for(int i=0;i<m;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(sa.search(nums, target));
    }
}