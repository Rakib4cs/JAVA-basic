package AssignValue;
import java.util.Scanner;
public class Value {
    public static void main(String[] args){

    int x,y;
    Scanner input= new Scanner(System.in);
    System.out.println("Enter value of x:");
    x= input.nextInt();

    System.out.println("Enter value of y:");
        y= input.nextInt();

    x+=y;
    System.out.println("x:"+x );
    x-=y;
    System.out.println("x:"+x );
    x*=y;
    System.out.println("x:"+x );
    x/=y;
    System.out.println("x:"+x );
    x%=y;
    System.out.println("x:"+x );
    }

}
