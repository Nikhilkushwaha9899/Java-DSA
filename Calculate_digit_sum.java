public class Calculate_digit_sum {
    public String digitSum(String s, int k) {
        if (s.length() <= k)
            return s;

        StringBuilder next = new StringBuilder();
        for (int i = 0; i < s.length(); i += k) {
            int sum = 0;
            for (int j = i; j < s.length() && j < i + k; j++)
                sum += s.charAt(j) - '0';
            next.append(sum);
        }

        return digitSum(next.toString(), k);
    }

    public static void main(String[] args) {
        Calculate_digit_sum cds = new Calculate_digit_sum();
        String s = "11111222223";
        int k = 3;
        System.out.println(cds.digitSum(s, k));
    }
}
