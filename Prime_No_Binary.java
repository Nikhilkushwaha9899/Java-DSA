import java.util.ArrayList;
import java.util.List;

public class Prime_No_Binary {
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        List<String> l = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        int countmain = 0;
        for (int i = left; i <= right; i++) {
            l.add(Integer.toBinaryString(i));
        }
        for (int i = 0; i < l.size(); i++) {
            String str = l.get(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    count++;
                }
            }
            countList.add(count);
        }
        for (int num : countList) {
            if (isPrime(num)) {
                countmain++;
            }
        }
        return countmain;
    }

    public static void main(String[] args) {
        Prime_No_Binary pnb = new Prime_No_Binary();
        int left = 10;
        int right = 15;
        System.out.println(pnb.countPrimeSetBits(left, right));
    }
}
