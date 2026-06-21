import java.util.*;
public class max_icecream_bars {
    public int maxIceCream(int[] costs, int coins){
        Arrays.sort(costs);
        int sum=0;
        int count =0;
        for(int i=0;i<costs.length;i++){
           if(sum+costs[i]<=coins){
            sum+=costs[i];
            count++;
           }
           else{
            break;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        max_icecream_bars mib =new max_icecream_bars();
        int n=sc.nextInt();
        int coins=sc.nextInt();
        int costs[]=new int[n];
        for(int i=0;i<costs.length;i++){
            costs[i]=sc.nextInt();
        }
        System.out.println(mib.maxIceCream(costs, coins));
    }
}
