import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bouquet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            long temp = m;
            ArrayList<Integer> arr = new ArrayList<>();
            while (n-- != 0) {
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            long max_so_far = -1;
            for (int i = arr.size() - 1; i >= 0; i--) {
                long max = 0;
                if (temp > arr.get(i)) {
                    max = arr.get(i);
                    temp -= arr.get(i);
                    for (int j = i - 1; j >= 0; j--) {
                        if (arr.get(i) - arr.get(j) == 1 || arr.get(i) - arr.get(j) == 0) {
                            if (temp >= arr.get(j)) {
                                max += arr.get(j);
                                temp -= arr.get(j);
                            }
                        } else {
                            if (max > max_so_far) {
                                max_so_far = max;
                            }
                            temp = m;
                            break;
                        }
                    }
                }
            }
            pw.println(max_so_far);
        }
        pw.close();
    }
}
