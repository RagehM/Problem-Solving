import java.util.Stack;

public class Asteroid_Collision_735 {
	public static int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(asteroids[0]);
		for (int i = 1; i < asteroids.length; i++) {
			while (!s.empty() && asteroids[i] < 0 && s.peek() > 0) {
				int sum = asteroids[i] + s.peek();
				if (sum < 0) {
					s.pop();
				} else if (sum == 0) {
					s.pop();
					asteroids[i] = 0;
				} else {
					asteroids[i] = 0;
				}
			}
			if (asteroids[i] != 0) {
				s.push(asteroids[i]);
			}
		}
		int[] result = new int[s.size()];
		int i = result.length - 1;
		while (!s.empty()) {
			result[i--] = s.pop();
		}
		return result;
	}

	public static void main(String[] args) {
		int[] asteroids = {5, 10, -5};
		int[] result = asteroidCollision(asteroids);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
}
