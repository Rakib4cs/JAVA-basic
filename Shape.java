package AreaofShapes;
import java.util.Scanner;
public class Shape {

    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        double base, height, area , r, n , l, w;

        System.out.println("Enter base of triangle:");
        base= input.nextDouble();
        System.out.println("Enter height of triangle:");
        height= input.nextDouble();

        area= 0.5*base*height;
        System.out.println("Area of triangle:"+area);


       System.out.println("Enter value of r:");
       r=input.nextDouble();

       area=3.1416*r;
       System.out.println("Area of circle:"+area);

       System.out.println("Enter value of n:");
       n= input.nextDouble();

       area=n*n;
       System.out.println("Area of Square field:"+area);

       System.out.println("Enter length:");
       l= input.nextDouble();

       System.out.println("Enter wide:");
       w= input.nextDouble();

       area=l*w;
       System.out.println("Area of rectangle:"+area);



    }

}
