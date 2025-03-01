public class Maximum_Average_Subarray_I_643 {
	public static double findMaxAverage(int[] nums, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		double max = sum;
		for (int i = k; i < nums.length; i++) {
			sum += nums[i] - nums[i - k];
			if (max < sum) {
				max = sum;
			}
		}
		return max / k;
	}

	public static void main(String[] args) {
		int[] nums = {1, 12, -5, -6, 50, 3};
		int k = 4;
		System.out.println(findMaxAverage(nums, k));
	}
}
