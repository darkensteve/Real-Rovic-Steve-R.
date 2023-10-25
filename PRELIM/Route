import java.util.Scanner;

   public class Route{
   
     public static void main(String[] args)
       {
         Scanner scan = new Scanner(System.in);
         
         double dis = 84.9;
         double dis1 = 93.9;
         double dis2 = 92.2;
         double eta = 0;
         
         String defaultRoute = "\nRecommended Routes: \n> Cebu City - South Bus (Start)\n> Minglanilla (Route 1)\n> San Fernando (Route 2)\n> Carcar (Route 3)"
                               +"\n> Barili (Route 4.1)\n> Dumanjug (Route 4.1.1)\n> Alcantara (Route 4.1.2)\n> Moalboal (End)";
         String recommendedRoute = "\nRecommended Routes: \n> Cebu City - South Bus (Start)\n> Minglanilla (Route 1)\n> San Fernando (Route 2)\n> Carcar (Route 3)"
                                    +"\n> Sibonga (Route 4.2)\n> Dumanjug (Route 4.2.1)\n> Alcantara (Route 4.2.2)\n> Moalboal (End)";
         String otherRoute = "\nRecommended Routes: \n> Cebu City - South Bus (Start)\n> Minglanilla (Route 1)\n> San Fernando (Route 2)\n> Carcar (Route 3)"
                             +"\n> Sibonga (Route 4.2)\n> Argao (Route 5)\n> Ronda (Route 5.1)\n> Alcantara (Route 5.2)\n> Moalboal (End)"; 
        
        System.out.println("Welcome to Cebu City!");
        System.out.println(defaultRoute);
        System.out.println("\nIs route to Barili obstructed?(Yes/No)");

        while (true) {
            System.out.print("Response: ");
            String res = scan.nextLine();

            if (res.equalsIgnoreCase("Yes")) {
                System.out.println(recommendedRoute);
                System.out.println("\nIs route to Dumanjug also obstructed?(Yes/No)");

                while (true) {
                    System.out.print("Response: ");
                    String choice = scan.nextLine();

                    if (choice.equalsIgnoreCase("Yes")) {
                        System.out.println("How fast are you going?(km/hr)");
                        System.out.print("Response: ");
                        int speed;
                        
                        while (true){
                           if (scan.hasNextInt()){
                              speed = scan.nextInt();
                              break;
                           } else {
                              System.out.println("Invalid input. Enter an integer.");
                              System.out.print("Response: ");
                              scan.next();
                           }
                        }  
                        
                        eta = dis2 / speed;

                        int hrs = (int) eta;
                        int mins = (int) (eta - hrs) * 60;

                        System.out.println(otherRoute);
                        System.out.println("\nAdditional Data: \n> Speed: " + speed + "\n> Distance: " + dis2 + " km");
                        System.out.println("> ETA: " + hrs + " hrs and " + mins + " mins");
                        break;
                        
                    } else if (choice.equalsIgnoreCase("No")) {
                        System.out.println("How fast are you going?(km/hr)");
                        System.out.print("Response: ");
                        int speed;
                        
                        while (true){
                           if (scan.hasNextInt()){
                              speed = scan.nextInt();
                              break;
                           } else {
                              System.out.println("Invalid input. Enter an integer.");
                              System.out.print("Response: ");
                              scan.next();
                           }
                        }  
                        
                        eta = dis1 / speed;

                        int hrs = (int) eta;
                        int mins = (int) ((eta - hrs) * 60);

                        System.out.println(recommendedRoute);
                        System.out.println("\nAdditional Data: \n> Speed: " + speed + "\n> Distance: " + dis1 + " km");
                        System.out.println("> ETA: " + hrs + " hrs and " + mins + " mins");
                        break;
                        
                    } else {
                        System.out.println("Invalid input. Enter (Yes/No).");
                    }
                }
                
                break;
                
            } else if (res.equalsIgnoreCase("No")) {
                System.out.println("How fast are you going?(km/hr)");
                System.out.print("Response: ");
                int speed;
                
                  while (true){
                     if (scan.hasNextInt()){
                        speed = scan.nextInt();
                        break;
                     } else {
                        System.out.println("Invalid input. Enter an integer.");
                        System.out.print("Response: ");
                        scan.next();
                     }
                  }   
                     
                eta = dis / speed;

                int hrs = (int) eta;
                int mins = (int) ((eta - hrs) * 60);

                System.out.println(defaultRoute);
                System.out.println("\nAdditional Data: \n> Speed: " + speed + "\n> Distance: " + dis + " km");
                System.out.println("> ETA: " + hrs + " hrs and " + mins + " mins");
                break;
                
               } else {
                System.out.println("Invalid input. Enter (Yes/No).");
            }
        }
    }
}
