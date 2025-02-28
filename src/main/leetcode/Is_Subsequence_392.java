public class Is_Subsequence_392 {
	public static boolean isSubsequence(String s, String t) {
		if (s.length() > t.length()) {
			return false;
		}
		if (s.length() == 0) {
			return true;
		} else {
			int i = 0;
			int j = 0;
			for (i = 0; i < t.length(); i++) {
				if (t.charAt(i) == s.charAt(j)) {
					j++;
					if (j == s.length()) {
						return true;
					}
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}
}
