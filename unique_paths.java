import java.util.Scanner;

public class unique_paths {
    public int count(int i ,int j ,int m , int n){
            if(i>=m || j>=n){
                return 0;
            }
            if(i==m-1 && j==n-1){
                return 1;
            }
            int downPath=count( i+1 , j , m ,  n);
            int rightPath=count( i ,j+1 ,m , n);

            return downPath+rightPath;
        }
        public static void main(String[] args) {
            unique_paths up=new unique_paths();
            Scanner sc =new Scanner(System.in);
            int m=sc.nextInt();
            int n=sc.nextInt();
            System.out.println("Path :" + up.count(0, 0, m, n));
        }
}
