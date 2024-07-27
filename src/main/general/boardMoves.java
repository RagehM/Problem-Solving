import java.math.BigInteger;
import java.util.Scanner;

public class boardMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            BigInteger moves = new BigInteger("0");
            for (int i = 1; i <= n / 2; i++) {
                BigInteger anotherValue = new BigInteger("" + i * (8 * i));
                moves = moves.add(anotherValue);
                System.out.println(moves);
            }
            System.out.println(moves);
        }
    }
}
