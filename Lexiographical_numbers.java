import java.util.*;

public class Lexiographical_numbers {
    public List<Integer> lexicalOrder(int n) {
        List<String> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            l.add(String.valueOf(i));
        }
        Collections.sort(l);
        List<Integer> res = new ArrayList<>();
        for (String s : l) {
            res.add(Integer.parseInt(s));
        }
        return res;
    }

    public static void main(String[] args) {
        Lexiographical_numbers ln = new Lexiographical_numbers();
        int n = 13;
        System.out.println(ln.lexicalOrder(n));
    }
}
