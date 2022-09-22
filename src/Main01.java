
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        {
            int e = 0;
            if (a > b) {
                e = a;
                a = b;
                b = e;
            }
            if (b > c) {
                e = b;
                b = c;
                c = e;
            }
            if (a > b) {
                e = a;
                a = b;
                b = e;
            }
            System.out.println(c - a);

        }
    }
}