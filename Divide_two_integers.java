import java.util.*;
public class Divide_two_integers {
    public int divide(int dividend, int divisor){
     double result = (double)dividend/divisor;
        return (int)result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
     Divide_two_integers dti = new Divide_two_integers();
     System.out.println(dti.divide(dividend,divisor));   
    }
}
