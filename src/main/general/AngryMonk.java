import java.util.ArrayList;
import java.util.Scanner;

public class AngryMonk {

    private static int get_max_index(ArrayList<Integer> array) {
        int max = Integer.MIN_VALUE;
        int max_index = -1;
        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)) {
                max_index = i;
                max = array.get(i);
            }
        }
        return max_index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int operations = 0;
            ArrayList<Integer> array = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                array.add(sc.nextInt());
            }
            int noOnes = 0;
            int max_index = get_max_index(array);
            int max = array.get(max_index);
            int occur = 0;
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) == max) {
                    occur++;
                }
            }
            if (max == 1) {
                noOnes += array.size();
            } else {
                for (int i = 0; i < array.size(); i++) {
                    int no = array.get(i);
                    if (occur == 1) {
                        if (no != max && no != 1) {
                            operations += no - 1;
                            noOnes += no;
                        }
                        if (no == 1) {
                            noOnes += 1;
                        }
                    } else if (occur != 1 && no == max) {
                        if (no != 1) {
                            operations += no - 1;
                            noOnes += no;
                        }
                        if (no == 1) {
                            noOnes += 1;
                        }
                        occur--;
                    } else {
                        if (no != 1) {
                            operations += no - 1;
                            noOnes += no;
                        }
                        if (no == 1) {
                            noOnes += 1;
                        }
                    }
                }
            }
            if (max == 1) {
                operations += noOnes - 1;
            } else {
                operations += noOnes;
            }
            System.out.println(operations);
        }
    }
}
