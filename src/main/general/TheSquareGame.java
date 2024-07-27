import java.io.PrintWriter;
import java.util.Scanner;

public class TheSquareGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            pw.print((a * i + b) + " ");
        }
        pw.close();
    }
}
