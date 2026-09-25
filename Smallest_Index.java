import java.util.*;
public class Smallest_Index {
    public int target(int i){
        int sum=0;
        while(i>0){
            sum=sum+i%10;
            i=i/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==target(nums[i])){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Smallest_Index si=new Smallest_Index();
        int nums[]={99,99,99,99,99,99,99,99,99,99};
        System.out.println(si.smallestIndex(nums));
    }

}
