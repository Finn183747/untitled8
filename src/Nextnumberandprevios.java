import java.util.Scanner;

public class Nextnumberandprevios {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int c = a + 1;
        System.out.println("The next number for the number " + a + " is " + c + ".");
        int b = a - 1;
        System.out.println("The previous number for the number " + a + " is " + b + ".");
    }
}