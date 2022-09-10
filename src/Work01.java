
import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = a / 10;
        int c = b + 1;
        if (a < 10) {
            System.out.println("25");
        } else {
            System.out.println(b * c + "25");
        }
    }
}