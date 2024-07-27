import java.io.PrintWriter;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int g = 0; g < t; g++) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            int[][] prefA = new int[n + 1][26];
            int[][] prefB = new int[n + 1][26];

            for (int i = 1; i <= n; i++) {
                char ch = a.charAt(i - 1);
                for (int j = 0; j < 26; j++) {
                    prefA[i][j] = prefA[i - 1][j];
                }
                prefA[i][ch - 'a']++;
            }

            for (int i = 1; i <= n; i++) {
                char ch = b.charAt(i - 1);
                for (int j = 0; j < 26; j++) {
                    prefB[i][j] = prefB[i - 1][j];
                }
                prefB[i][ch - 'a']++;
            }

            for (int _q = 0; _q < q; _q++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                l--; r--;

                int[] freqA = new int[26];
                int[] freqB = new int[26];

                for (int j = 0; j < 26; j++) {
                    freqA[j] = prefA[r + 1][j] - (l > 0 ? prefA[l][j] : 0);
                    freqB[j] = prefB[r + 1][j] - (l > 0 ? prefB[l][j] : 0);
                }

                int operations = 0;
                for (int j = 0; j < 26; j++) {
                    operations += Math.abs(freqA[j] - freqB[j]);
                }

                System.out.println(operations / 2);
            }
        }
        sc.close();
    }
}
