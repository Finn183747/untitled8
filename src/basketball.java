import java.util.Scanner;

public class basketball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in .nextInt();
        int a1 =in .nextInt();
        int b = in.nextInt();
        int b1 = in.nextInt();

        int c = in.nextInt();
        int c1 = in.nextInt();
        int d =in.nextInt();
        int d1 = in.nextInt();

        if (a+b+c+d==a1+b1+c1+d1) {
            System.out.println("DRAW");
        } else if (a+b+c+d>a1+b1+c1+d1) {
            System.out.println(1);
        }else if (a+b+c+d<a1+b1+c1+d1){
            System.out.println(2);
        }
    }
}