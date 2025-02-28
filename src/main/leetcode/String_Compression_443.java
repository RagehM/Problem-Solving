public class String_Compression_443 {
	public static int compress(char[] chars) {
		int count = 1;
		char c = chars[0];
		String s = "";
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == c) {
				count++;
			} else {
				if (count == 1) {
					s += c + "";
				} else {
					s += c + "" + count;
					count = 1;
				}
				c = chars[i];
			}
		}
		if (c == chars[chars.length - 1] && count == 1) {
			s += c;
		}
		if (c == chars[chars.length - 1] && count != 1) {
			s += c + "" + count;
		}
		for (int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}
		return s.length();
	}

	public static void main(String[] args) {
		char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
		System.out.println(compress(chars));
	}
}
