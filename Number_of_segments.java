public class Number_of_segments {
    public int countSegments(String s) {
    if (s.isEmpty()) {
      return 0;
    }
    int cnt = 0;
    boolean m = false;
    for (char ch : s.toCharArray()) {
      if (ch != ' ') {
        m = true;
        continue;
      }
      if (ch == ' ' && m) {
        cnt++;
        m = false;
      }
    }
    if (m) {
      cnt++;
    }
    return cnt;
  }
  public static void main(String[] args) {
    Number_of_segments nos=new Number_of_segments();
     String s = "love live! mu'sic forever";
     System.out.println(nos.countSegments(s));
  }
}
