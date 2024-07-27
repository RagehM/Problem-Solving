import java.io.PrintWriter;
import java.util.Scanner;

public class xAxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- != 0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int x3 = sc.nextInt();
            int ans = Integer.MAX_VALUE;
            for (int i = 1; i <= 10; i++) {
                int inter = Math.abs(i - x1) + Math.abs(i - x2) + Math.abs(i - x3);
                if (ans > inter) {
                    ans = inter;
                }
            }
            pw.println(ans);
        }
        pw.close();
    }
}