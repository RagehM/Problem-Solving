import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int animals = 0;
            while (n > 0){
                if(n >= 4){
                    animals++;
                    n-=4;
                }
                else{
                    animals++;
                    n-=2;
                }
            }
            System.out.println(animals);
        }
    }
}
