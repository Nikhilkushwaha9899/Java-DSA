public class Reverse_deg_string {
    public int reverseDegree(String s) {
		int res=0;
         for (int i = 0; i < s.length(); i++) {
             res += (26 - (s.charAt(i) - 'a')) * (i + 1);
        }
		return res;
    }
    public static void main(String[] args) {
     Reverse_deg_string rds=new Reverse_deg_string();
     String s="abc";
     System.out.println(rds.reverseDegree(s));   
    }
}
