import java.io.PrintWriter;
import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int count = 0;

            for (int a = 1; a <= n; a++) {
                for (int b = 1; a * b <= n; b++) {
                    int c = x - a - b;
                    int ub = Math.min((n - (a*b)) / (a+b),x-a-b);
                    if(ub >=1 ){
                        count+=ub;
                    }
                }
            }
            pw.println(count);
        }
        pw.close();
    }
}
