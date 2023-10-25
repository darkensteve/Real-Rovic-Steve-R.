import java.util.Scanner;

public class Animal_sounds
{
  public static void main (String a[])
  {
    
    Scanner scan = new Scanner(System.in);
    
    
    System.out.println("Activity One: What does the animal say?");
    System.out.println("Select an animal: ");
    System.out.print("1.Dog\n2.Cat\n3.Goat\n4.Penguin\nEnter a number: ");
    int response = scan.nextInt();
    
    switch (response)
    {
        case 1:
        response = 1;
        Dog dogs = new Dog();
        dogs.displayName();
        break;
        
        case 2:
        response = 2;
        Cat cats = new Cat();
        cats.displayName();
        break;
        
        case 3:
        response = 1;
        Goat goats = new Goat();
        goats.displayName();
        break;
        
        case 4:
        response = 4;
        Penguin penguiny = new Penguin();
        penguiny.displayName();
        break;

        
        default:
        System.out.println("Invalid Input");
        return;
    }
   } 
 }   
   class Dog
   {
     public void displayName() {
     System.out.print("Animal: Dog \nSound: Arf Arf");  
   }
   } 
   class Cat extends Dog
   {
     public void displayName() {
     System.out.print("Animal: Cat \nSound: Meow Meow");  
   }
   } 
   class Goat extends Dog
   {
     public void displayName() {
     System.out.print("Animal: Goat \nSound: Meh Meh");  
   } 
   }
   class Penguin extends Dog
   {
     public void displayName() {
     System.out.print("Animal: Penguin \nSound: Honk Honk");  
   } 
  }
