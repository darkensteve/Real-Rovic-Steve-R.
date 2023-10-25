import java.util.Scanner;

public class MDA
 { 
   public static void main(String [] args)
     {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Input number:");
       int num = sc.nextInt();
       System.out.println("Input number:");
       int num1 = sc.nextInt();
       
       int multiply = num * num1;
       int division = num / num1;
       int addition = num + num1;
       
       System.out.print("Product is: " +multiply + "\nQuotient is: " + division + "\nSum is: " + addition);
    
       }
       }
