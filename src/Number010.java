import java.util.Scanner;

public class Number010 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int a = in.nextInt();
        int b = a / 10;
        System.out.println(b % 10);
    }
}