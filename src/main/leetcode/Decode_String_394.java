import java.util.Stack;

public class Decode_String_394 {
	public static String decodeString(String s) {
		int countRight = 0;
		String result = "";
		Stack<String> stack = new Stack<>();

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ']') {
				stack.push("]");
				countRight++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				if (countRight == 0) {
					result = s.charAt(i) + result;
				} else {
					stack.push(String.valueOf(s.charAt(i)));
				}
			} else if (s.charAt(i) == '[') {
				StringBuilder s1 = new StringBuilder();
				while (!stack.isEmpty() && !stack.peek().equals("]")) {
					s1.append(stack.pop());
				}
				if (!stack.isEmpty()) {
					stack.pop();
				}
				countRight--;
				StringBuilder calc = new StringBuilder();
				i--;
				while (i >= 0 && Character.isDigit(s.charAt(i))) {
					calc.insert(0, s.charAt(i--));
				}
				i++;
				int count = Integer.parseInt(calc.toString());
				String s2 = s1.toString().repeat(count);
				if (countRight >= 1) {
					stack.push(s2);
				} else {
					result = s2 + result;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		System.out.println(decodeString(s));
	}
}
