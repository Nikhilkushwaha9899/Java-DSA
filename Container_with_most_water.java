import java.util.*;
class Funtion{
    public int Max_Area(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        int m=arr.length;
        System.out.println("Please Input array elements");
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        int pr1=arr[0]*arr[m-1];
        for(int i=0;i<m-2;i++){
            count++;
        }
        int area=pr1*count;
        if(count == 0){
            area=1;
        }
        else{
            area=pr1*count;
        }
        sc.close();
        return area;
    }
}
public class Container_with_most_water {
public static void main(String[] args) {
    Funtion fn=new Funtion();
    System.out.println(fn.Max_Area());
}    
}
