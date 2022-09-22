import java.util.Scanner;

public class Cake01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>1) {
            if (a % 2 == 0) {
                System.out.println(a / 2);
            } if (a % 2 != 0) {
                System.out.println(a);
            }
        } else {
            System.out.println(0);
        }
    }
}