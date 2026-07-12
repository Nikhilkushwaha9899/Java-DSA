import java.util.*;
public class H_Index {
    public int hIndex(int[] citations) {
        int count = 0;
        if (citations.length == 1 && citations[0] == 0) {
            return count;
        }
        for (int i = 0; i < citations.length; i++) {
            for (int j = i + 1; j < citations.length; j++) {
                if (citations[i] < citations[j]) {
                    int temp = citations[i];
                    citations[i] = citations[j];
                    citations[j] = temp;
                }
            }
        }
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] > i) {
                count = i + 1;
            } else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        H_Index hi=new H_Index();
        int citations[] = { 0, 0, 2 };
        System.out.println(hi.hIndex(citations));
    }
}
