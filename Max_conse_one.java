import java.util.Scanner;

public class Max_conse_one {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count = 0; 
       int ans = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            ans = Math.max(count, ans);
        }
        return ans;
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Max_conse_one mso = new Max_conse_one();
        int nums[]={1,1,0,1,1,1};
     System.out.println(mso.findMaxConsecutiveOnes(nums)); 
    }
}
