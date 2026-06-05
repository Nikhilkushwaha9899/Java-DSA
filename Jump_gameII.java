import java.util.*;

public class Jump_gameII {
    public int jump(int[] nums) {
        int count =0;
        int jumper=0;
        int moover=0;  
        for(int i=0;i<nums.length-1;i++){
            moover=Math.max(moover, i+nums[i]);
        if(i==jumper){
                count++;
                jumper=moover;
        }
        }
        return count;
    }
    public static void main(String[] args) {
        Jump_gameII jg =new Jump_gameII();
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[]=new int[n];
        for(int j=0;j<n-1;j++){
            nums[j]=sc.nextInt();
        }
        System.out.println(jg.jump(nums));
    }
}
