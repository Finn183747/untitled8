import java.util.Scanner;

public class Watermelon01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int x = in.nextInt();
        int ac = x;
        int vx = x;

        for (int i = 2; i <= a; i++) {
            x = in.nextInt();
            if (x > vx) {
                vx = x;
            } if (x < ac) {
                ac = x;
            }
        }
        System.out.println(ac + " " + vx);
    }
}