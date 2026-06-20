import java.math.BigInteger;
import java.util.*;
public class mutiply_strings {
    public String multiply(String num1,String num2) {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        BigInteger multiply=n1.multiply(n2);
        return multiply.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mutiply_strings ms = new mutiply_strings();
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        System.out.println(ms.multiply(num1, num2));
    }
}
