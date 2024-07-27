import java.io.PrintWriter;
import java.util.Scanner;

public class ProblemGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            int[] array = new int[7];
            for (int i = 0; i < n; i++) {
                array[s.charAt(i) - 65]++;
            }
            int operations = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < m) {
                    operations += m - array[i];
                }
            }
            System.out.println(operations);
        }
    }
}