import java.util.Arrays;

public class Max_gap {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
		if(nums.length<2 && nums.length>0){
			return 0;
		}
		int diff=0;
		for(int i=1;i<nums.length;i++){
			diff=Math.max(nums[i]-nums[i-1],diff);
		}
		return diff;
    }
    public static void main(String[] args) {
        Max_gap mg=new Max_gap();
        int nums[]={10};
        System.out.println(mg.maximumGap(nums));
    }
}
