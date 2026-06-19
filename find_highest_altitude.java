import java.util.*;
public class find_highest_altitude{
    public int largestAltitude(int[] gain){
        int sum=0;
        int result []=new int[gain.length];
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            result[i]=sum;
        }
        int max=result[0];
        for(int i=0;i<result.length;i++){
            max=Math.max(max, result[i]);
        }
        if(max<0){
            max=0;
        }
        return max;
    }
    public static void main(String[] args) {
        find_highest_altitude fha = new find_highest_altitude();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] gain=new int[n];
        for(int x=0;x<gain.length;x++){
            gain[x]=sc.nextInt();
        }
        System.out.println(fha.largestAltitude(gain));
    }
}