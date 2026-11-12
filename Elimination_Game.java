import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elimination_Game {
    public int lastRemaining(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        List<Integer> l = new ArrayList<>();
        for (int i : arr) {
            l.add(i);
        }
        while (l.size() > 1) {
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < l.size(); i++) {
                if (i % 2 != 0) {
                    temp.add(l.get(i));
                }
            }
            l = temp;
            if (l.size() <= 1) {
                break;
            }
            temp = new ArrayList<>();
            for (int i = l.size() - 1; i >= 0; i--) {
                if ((l.size() - 1 - i) % 2 != 0) {
                    temp.add(l.get(i));
                }
            }
            Collections.reverse(temp);
            l = temp;
        }
        return l.get(0);
    }
    public static void main(String[] args) {
        Elimination_Game eg=new Elimination_Game();
        int k=9;
        System.out.println(eg.lastRemaining(k));
    }
}
