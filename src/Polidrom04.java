import java.util.Scanner;

public class Polidrom04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int c = a / 1000;
        int b = a % 10;
        int e = a / 100;
        int g = e % 10;
        int h = a / 10;
        int l = h % 10;

        if (c == b && g == l) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}