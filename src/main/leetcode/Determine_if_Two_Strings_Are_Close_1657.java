import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Determine_if_Two_Strings_Are_Close_1657 {
	public static boolean closeStrings(String word1, String word2) {
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (char c : word1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}

		for (char c : word2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}

		if (!map1.keySet().equals(map2.keySet())) {
			return false;
		}

		ArrayList<Integer> freq1 = new ArrayList<>(map1.values());
		ArrayList<Integer> freq2 = new ArrayList<>(map2.values());

		Collections.sort(freq1);
		Collections.sort(freq2);

		return freq1.equals(freq2);
	}

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "bca";
		System.out.println(closeStrings(word1, word2));
	}
}
