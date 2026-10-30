public class Add_Digits {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        Add_Digits ad = new Add_Digits();
        int num = 0;
        System.out.println(ad.addDigits(num));
    }
}
