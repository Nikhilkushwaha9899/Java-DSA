public class Sum_of_Sqr {
    public boolean judgeSquareSum(int c) {
		int m = (int) Math.floor(Math.sqrt(c));
		int arr[] = new int[m + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		long result = 0;
		long ptr1 = 0;
		long ptr2 = arr[arr.length - 1];
		while (ptr1 <= ptr2) {
			result = (ptr1 * ptr1) + (ptr2 * ptr2);
			if (result == c) {
				return true;
			} else if (result < c) {
				ptr1++;
			} else {
				ptr2--;
			}
		}
		return false;
	}
    public static void main(String[] args) {
        Sum_of_Sqr sos=new Sum_of_Sqr();
		int c = 2147483600;
		System.out.println(sos.judgeSquareSum(c));
    }
}
