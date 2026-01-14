package Assignment1;
import java.util.Scanner;
public class Product {

    public static void main(String[] args){

        Scanner input =new Scanner(System.in);
        int id;
        String title;
        int price;
        String description;
        char category;

        System.out.println("Enter id:");
         id= input.nextInt();
         System.out.println("id=\t"+id);
         System.out.println("Enter title:");
         title= input.next();
         System.out.println("title=\t"+title);
         System.out.println("Enter price:");
         price= input.nextInt();
         System.out.println("price=\t"+price);
         System.out.println("Enter description:");
         description = input.next();
         System.out.println("description=\t"+description);
         System.out.println("Enter category:");
         category= input.next().charAt(0);
         System.out.println("category=\t"+category);



    }
}
