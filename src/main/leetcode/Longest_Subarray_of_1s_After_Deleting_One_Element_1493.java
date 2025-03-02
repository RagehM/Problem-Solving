public class Longest_Subarray_of_1s_After_Deleting_One_Element_1493 {
	public static int longestSubarray(int[] nums) {
		int left = 0;
		int max = 0;
		int zeros = 0;
		for (int right = 0; right < nums.length; right++) {
			if (nums[right] == 0) {
				zeros++;
			}
			while (zeros > 1) {
				if (nums[left] == 0) {
					zeros--;

				}
				left++;
			}
			max = Math.max(max, right - left + 1 - zeros);
		}
		if (max == nums.length) {
			return max - 1;
		} else {
			return max;
		}
	}

	public static void main(String[] args) {
		int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};
		System.out.println(longestSubarray(nums));
	}
}
