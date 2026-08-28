import java.util.*;

public class Jwels_Stones {
    public int numJewelsInStones(String jewels, String stones) {
        List<Character> l = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            l.add(jewels.charAt(i));
        }
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (l.get(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "abc";
        String stones = "";
        Jwels_Stones js = new Jwels_Stones();
        System.out.println(js.numJewelsInStones(jewels, stones));
    }
}