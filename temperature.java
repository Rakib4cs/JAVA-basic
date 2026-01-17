package CalcuTemperature;
import java.util.Scanner;
public class temperature {

public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    double f,c,k;

    System.out.println("Enter Celsius:");
    c= input.nextDouble();

    f=1.8*c+32;
    System.out.println("Temperature in F:"+f);

    c=0.555*f-32;
    System.out.println("Temperature in C:"+c);

    k=c+273.15;
    System.out.println("Temperature in K:"+k);

   }
}
