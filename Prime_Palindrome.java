public class Prime_Palindrome {
    public boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isPalindrome(int x) {
		String s = Integer.toString(x);
		String rev = new StringBuilder(s).reverse().toString();
		return s.equals(rev);
	}

	public int primePalindrome(int n) {
		if (n <= 11) {
			for (int i = n; i <= 11; i++) {
				if (isPrime(i) && isPalindrome(i)) {
					return i;
				}
			}
		}
		for (int i = 1; i <= 100000; i++) {
			String s = String.valueOf(i);
			String rev = new StringBuilder(s.substring(0, s.length() - 1))
					.reverse()
					.toString();

			int palindrome = Integer.parseInt(s + rev);

			if (palindrome >= n && isPrime(palindrome)) {
				return palindrome;
			}
		}

		return 0;
	}
    public static void main(String[] args) {
        Prime_Palindrome pp=new Prime_Palindrome();
        int n = 9989900;
		System.out.println(pp.primePalindrome(n));
    }
}
