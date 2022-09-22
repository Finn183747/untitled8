import java.util.Scanner;

public class fstmen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a == b && b == c && a == c) {
            System.out.println(a);
        }
        if (a > b && a > c) {
            if (a <= 727 && a >= 30) {
                System.out.println(a);
            } else {
                System.out.println("ERROR");
            }
        } else if (b > a && b > c) {
            if (b <= 727 && b >= 30) {
                System.out.println(b);
            } else {
                System.out.println("ERROR");
            }
        } else if (c > a && c > b) {
            if (c <= 727 && c >= 30) {
                System.out.println(c);
            } else {
                System.out.println("ERROR");
            }
        }
    }
}