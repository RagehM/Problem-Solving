import java.util.Scanner;

public class Scale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                String line = sc.next();
                String[] numbers = line.split("");
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(numbers[j]);
                }
            }
            int[][] res = new int[n / k][n / k];
            for (int i = 0; i < n; i += k) {
                for (int j = 0; j < n; j += k) {
                    System.out.println(i / k + " " + j / k);
                    res[i / k][j / k] = arr[i][j];
                }
            }
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}