public class Two_sum_II {
    public int[] twoSum(int[] numbers, int target) {
		int arr[] = new int[2];
		int l = 0;
		int r = numbers.length - 1;
		while (l < r) {
			int sum = numbers[l] + numbers[r];
			if (sum > target) {
				r--;
			} else if (sum < target) {
				l++;
			} else {
				arr[0] = l + 1;
				arr[1] = r + 1;
				return arr;
			}
		}
		return arr;
	}
    public static void main(String[] args) {
        
    }
}
