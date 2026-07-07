import java.util.*;

class Concat_nonzero_digit {
    public long sumAndMultiply(int n) {
        String s = Integer.toString(n);
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                ns += s.charAt(i);
            }
        }
        long sum = 0;
        long nn=Long.parseLong(ns);
        long og=nn;
        while(nn>0){
            sum+=(nn%10);
            nn=nn/10;
        }
        return og*sum;
    }

    public static void main(String[] args) {
        Concat_nonzero_digit cnd=new Concat_nonzero_digit();
        int n=1000;
        System.out.println(cnd.sumAndMultiply(n));
    }
}