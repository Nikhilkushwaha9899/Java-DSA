import java.util.*;

public class Fizz_Buzz {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                l.add("FizzBuzz");
            } else if (i % 3 == 0) {
                l.add("Fizz");
            } else if (i % 5 == 0) {
                l.add("Buzz");
            } else {
                l.add(String.valueOf(i));
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Fizz_Buzz fb = new Fizz_Buzz();
        int n = 15;
        System.out.println(fb.fizzBuzz(n));
    }
}
