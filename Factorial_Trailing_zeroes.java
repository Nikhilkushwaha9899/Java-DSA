public class Factorial_Trailing_zeroes {
    public int trailingZeroes(int n) {
		int count = 0;
		while (n > 0) {
			n /= 5;
			count += n;
		}
		return count;
	}
    public static void main(String[] args) {
        Factorial_Trailing_zeroes ftz=new Factorial_Trailing_zeroes();
        int n=0;
        System.out.println(ftz.trailingZeroes(n));
    }
}
