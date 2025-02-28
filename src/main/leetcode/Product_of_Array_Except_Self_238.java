public class Product_of_Array_Except_Self_238 {
	public static int[] productExceptSelf(int[] nums) {
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		int calcLeft = 1;
		int calcRight = 1;
		for (int i = 0; i < nums.length; i++) {
			left[i] = calcLeft;
			calcLeft *= nums[i];
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			right[i] = calcRight;
			calcRight *= nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = left[i] * right[i];
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] result = productExceptSelf(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
