import java.util.Arrays;

public class Kth_Smallest_Lexico_Order {
    public int findKthNumber(int n, int k) {
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
        arr[i] = String.valueOf(i + 1);
        }
        Arrays.sort(arr);
        return Integer.parseInt(arr[k - 1]);
    }
    public static void main(String[] args) {
        Kth_Smallest_Lexico_Order kslo=new Kth_Smallest_Lexico_Order();
        int n = 13;
        int k = 2;
        System.out.println(kslo.findKthNumber(n, k));
    }
}
