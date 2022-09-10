import java.util.Scanner;

public class perevaz1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a / 10;
        int c = a % 10;
        if (c == 0) {
            System.out.println(b);
        } else {
            System.out.println(b + 1);
        }
    }
}