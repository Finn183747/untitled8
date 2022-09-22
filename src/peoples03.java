import java.util.Scanner;

public class peoples03 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();//а ровно 3
        int b = in.nextInt();//б ровно 2
        int c = in.nextInt();//c равно 4
        int x = 0;
        if (a>b){
          x=a;//x=3
          a=b;//a=2
          b=x;//b=3


        }
        if (b>c){
            x=b;//x=3
            b=c;//b=4
            c=x;//c=3




        }
        if (a>b){
            x=a;//x=2
            a=b;//a=3
            b=x;//b=2


        }
        if (727<c||c<94||727<a||a<94|| 727<b||b<94 ){
            System.out.println("Error");





        }
        else{
            System.out.println(c);


        }

        }
}
