import java.util.Arrays;

public class Max_Number_of_K_Sum_Pairs_1679 {
	public static int maxOperations(int[] nums, int k) {
		Arrays.sort(nums);
		int i = 0;
		int j = nums.length - 1;
		int c = 0;
		while (i < j) {
			if (nums[i] + nums[j] == k) {
				i++;
				j--;
				c++;
			}
			if (nums[i] + nums[j] < k) {
				i++;
			}
			if (nums[i] + nums[j] > k) {
				j--;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int k = 5;
		System.out.println(maxOperations(nums, k));
	}
}
