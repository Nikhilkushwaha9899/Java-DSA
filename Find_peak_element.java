import java.util.Scanner;

public class Find_peak_element {
    public int findPeakElement(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length - 1;
}
public static void main(String[] args) {
        Find_peak_element fpe =new Find_peak_element();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int j=0;j<n;j++){
            nums[j]=sc.nextInt();
        }
        System.out.println(fpe.findPeakElement(nums));
    }
}
