public class Container_With_Most_Water_11 {
	public static int maxArea(int[] height) {
		int max = 0;
		int j = height.length - 1;
		int i = 0;
		while (i < j) {
			int area = 0;
			if (height[i] < height[j]) {
				area = height[i] * (j - i);
				i++;
			} else {
				area = height[j] * (j - i);
				j--;
			}
			if (area > max) {
				max = area;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println(maxArea(height));
	}
}
