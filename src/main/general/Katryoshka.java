        import java.util.Arrays;
        import java.util.Scanner;

        public class Katryoshka{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                long eyes = sc.nextLong();
                long mouth = sc.nextLong();
                long bodies = sc.nextLong();
                long count = 0;
                long min = Long.min(eyes,Long.min(mouth,bodies));
                eyes-=min;
                mouth-=min;
                bodies-=min;
                count+= min;
                min = Long.min(eyes / 2, bodies);
                count += min;
                System.out.println(count);
            }
        }
