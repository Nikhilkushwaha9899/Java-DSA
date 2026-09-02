public class Monotonic_array {
    public boolean isMonotonic(int[] nums) {
        boolean small=true;
		boolean big=true;
		for(int i=1;i<nums.length;i++){
			if(nums[i-1]>nums[i]){
				small=false;
			}
			if(nums[i]<nums[i-1]){
				big=false;
			}
		}
		return small || big;
    }
    public static void main(String[] args) {
        Monotonic_array ma=new Monotonic_array();
        int nums[]={1, 2, 2, 1};
        System.out.println(ma.isMonotonic(nums));
    }
}
