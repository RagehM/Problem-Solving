import java.util.LinkedList;

public class Reverse_Vowels_of_a_String_345 {

	public static String reverseVowels(String s) {
		LinkedList<Integer> loc = new LinkedList<Integer>();
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'a'
							|| s.charAt(i) == 'E' || s.charAt(i) == 'e'
							|| s.charAt(i) == 'I' || s.charAt(i) == 'i'
							|| s.charAt(i) == 'O' || s.charAt(i) == 'o'
							|| s.charAt(i) == 'U' || s.charAt(i) == 'u') {
				loc.add(i);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'a'
							|| s.charAt(i) == 'E' || s.charAt(i) == 'e'
							|| s.charAt(i) == 'I' || s.charAt(i) == 'i'
							|| s.charAt(i) == 'O' || s.charAt(i) == 'o'
							|| s.charAt(i) == 'U' || s.charAt(i) == 'u') {
				int loc1 = loc.removeLast();
				s2 += s.charAt(loc1);
			} else {
				s2 += s.charAt(i);
			}
		}
		return s2;
	}

	public static void main(String[] args) {
		System.out.println(reverseVowels("IceCreAm"));
	}
}

// Better solution to learn from
//public String reverseVowels(String s) {
//	char[] chars = s.toCharArray();
//	Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
//	int left = 0, right = chars.length - 1;
//
//	while (left < right) {
//		while (left < right && !vowels.contains(chars[left])) {
//			left++;
//		}
//		while (left < right && !vowels.contains(chars[right])) {
//			right--;
//		}
//		if (left < right) {
//			char temp = chars[left];
//			chars[left] = chars[right];
//			chars[right] = temp;
//			left++;
//			right--;
//		}
//	}
//	return new String(chars);
//}
