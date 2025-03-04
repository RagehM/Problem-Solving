public class Find_the_Highest_Altitude_1732 {
	public static int largestAltitude(int[] gain) {
		int max = 0;
		int alt = 0;
		for (int i = 0; i < gain.length; i++) {
			alt += gain[i];
			max = Math.max(max, alt);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] gain = {-5, 1, 5, 0, -7};
		System.out.println(largestAltitude(gain));
	}
}
