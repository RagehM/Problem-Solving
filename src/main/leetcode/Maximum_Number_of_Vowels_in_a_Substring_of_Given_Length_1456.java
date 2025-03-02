import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length_1456 {
	public static int maxVowels(String s, int k) {
		Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		int count = 0;
		for (int i = 0; i < k; i++) {
			if (vowels.contains(s.charAt(i))) {
				count++;
			}
		}
		int max = count;
		for (int i = k; i < s.length(); i++) {
			if (vowels.contains(s.charAt(i - k))) {
				count--;
			}
			if (vowels.contains(s.charAt(i))) {
				count++;
				max = Math.max(max, count);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String s = "abciiidef";
		int k = 3;
		System.out.println(maxVowels(s, k));
	}
}
