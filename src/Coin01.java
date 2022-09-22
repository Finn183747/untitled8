import java.util.Scanner;

public class Coin01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();

        int a = 0;
        int b = 0;

        for (int i = 0; i < e; i++) {
            if (in.nextInt() == 0) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(Math.min(a, b));
    }
}