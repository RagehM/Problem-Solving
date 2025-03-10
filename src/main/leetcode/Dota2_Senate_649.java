import java.util.LinkedList;
import java.util.Queue;

public class Dota2_Senate_649 {
	public static String predictPartyVictory(String senate) {
		int n = senate.length();
		Queue<Integer> radiant = new LinkedList<>();
		Queue<Integer> dire = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			if (senate.charAt(i) == 'R') {
				radiant.add(i);
			} else {
				dire.add(i);
			}
		}
		while (!radiant.isEmpty() && !dire.isEmpty()) {
			if (radiant.peek() < dire.peek()) {
				radiant.add(n++);
			} else {
				dire.add(n++);
			}
			radiant.poll();
			dire.poll();
		}
		return radiant.isEmpty() ? "Dire" : "Radiant";
	}

	public static void main(String[] args) {
		String senate = "RD";
		System.out.println(predictPartyVictory(senate));
	}
}
