import java.util.Stack;

public class Decode_String_394 {
	public static String decodeString(String s) {
		String result = "";
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ']') {
				stack.push(String.valueOf(s.charAt(i)));
			} else {
				String str = "";
				while (!stack.peek().equals("[")) {
					str = stack.pop() + str;
				}
				stack.pop();
				String no = "";
				while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
					no = stack.pop() + no;
				}
				int number = Integer.parseInt(no);
				String str2 = "";
				while (number-- != 0) {
					str2 += str;
				}
				stack.push(str2);
			}
		}
		while (!stack.isEmpty()) {
			result = stack.pop() + result;
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		System.out.println(decodeString(s));
	}
}
