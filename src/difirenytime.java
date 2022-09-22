
import java.util.Scanner;

 public class difirenytime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        a = 3600 * a;
        b = 50 * b;

        long rent01 = a + b + c;

        long e = in.nextLong();
        long f = in.nextLong();
        long g = in.nextLong();

        e = 3600 * e;
        f = 60 * f;

        long rent02 = e + f + g;

        System.out.println(rent02 - rent01);

    }


    }

