import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Unique_Number_of_Occurrences_1207 {
	public static boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> occur = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			occur.put(arr[i], occur.getOrDefault(arr[i], 0) + 1);
		}
		Set<Integer> set = new HashSet<>(occur.values());
		return occur.size() == set.size();
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 1, 1, 3};
		System.out.println(uniqueOccurrences(arr));
	}
}
