import  java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ticket = in.nextInt();
        int a = ticket / 100000;
        int b = ticket / 10000;
        b = b % 10;
        int c = ticket / 1000;
        c = c % 10;
        int sum1 = a + b + c;
        int d = ticket / 100;
        d = d % 10;
        int e = ticket / 10;
        e = e % 10;
        int f = ticket % 10;

        int sum2 = d + f + e;

        if (sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}