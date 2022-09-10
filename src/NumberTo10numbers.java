import java.util.Scanner;

public class NumberTo10numbers{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a / 100;
        int c = a / 10;
        int d = c % 10;
        int e = a % 10;
        int v = b + e + d;
        System.out.println(v);
    }
}