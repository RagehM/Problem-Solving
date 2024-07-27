import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OnlyPluses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int product = 0;
        while (t != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            product = a * b * c;
            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 5 - i; j++) {
                    int new_a = a + i;
                    int new_b = b + j;
                    int new_c = c + (5 - i - j);
                    product = Math.max(new_a * new_b * new_c, product);
                }
            }
            t--;
            System.out.println(product);
        }
    }
}
