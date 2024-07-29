import java.io.PrintWriter;
import java.util.Scanner;

public class Biblical_Journeys_in_Bethlehem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int wait = 0;
            while(n-- > 0){
                int d = sc.nextInt();
                int p = sc.nextInt();
                if(wait == 0){
                    wait+=d;
                }
                else{
                    if(p-wait >= 0){
                        wait+=d;
                    }
                }
            }
            pw.println(wait);
        }
        pw.close();
    }
}
