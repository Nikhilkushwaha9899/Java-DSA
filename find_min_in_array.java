import java.util.*;

public class find_min_in_array {
    public int findMin(int[] nums){
        Arrays.sort(nums);
        int result=nums[0];
        return result;
    }
    public static void main(String[] args) {
        find_min_in_array fa =new find_min_in_array();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(fa.findMin(nums));
    }
}
