public class Check_All_a_before_b {
    public boolean checkString(String s) {
        return !s.contains("ba");
    }
    public static void main(String[] args) {
        Check_All_a_before_b cab=new Check_All_a_before_b();
        String s = "aaabbb";
        System.out.println(cab.checkString(s));
    }
}
