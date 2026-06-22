import java.util.*;
public class search_rotated_array {
      public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
          if(nums[i]==target){
            return true;
          }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        search_rotated_array sra = new search_rotated_array();
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(sra.search(nums, target));
}
}
