public class Find_Difference {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for (int i = 0; i < s.length(); i++) {
            res ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            res ^= t.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Find_Difference fd = new Find_Difference();
        String s = "";
        String t = "a";
        System.out.println(fd.findTheDifference(s, t));
    }
}
