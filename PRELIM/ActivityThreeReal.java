import java.util.Scanner;

public class ActivityThreeReal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float C1 = 100.00f;
        float C2 = 150.00f;
        float C3 = 200.00f;
        
        float R1 = 35.00f;
        float R2 = 50.00f;
        
        float exchangeRate = 56.00f;

        System.out.println("Menu: ");
        System.out.println("1. C1 - Php 100.00");
        System.out.println("2. C2 - Php 150.00");
        System.out.println("3. C3 - Php 200.00");
        System.out.println("4. Cancel Order");
        System.out.print("\nChoose your main menu: ");
        int choi = scan.nextInt();

        if (choi == 4) {
            System.out.println("Canceling Order....");
            System.out.print("\nOrder Cancelled.");
        } else if (choi < 1 || choi > 3) {
            System.out.println("Invalid choice. Please choose a valid option.");
        } else {
            float totalPHP = 0.00f;
            String orderCode = "";
            String productUSD = "";
            int mainMenuQty = 0; // Quantity of main menu item
            int addonsQty = 0; // Quantity of add-ons

            switch (choi) {
                case 1:
                    totalPHP = C1;
                    orderCode = "C1";
                    productUSD = "C1 - USD " + String.format("%.2f", (C1 / exchangeRate));
                    break;
                case 2:
                    totalPHP = C2;
                    orderCode = "C2";
                    productUSD = "C2 - USD " + String.format("%.2f", (C2 / exchangeRate));
                    break;
                case 3:
                    totalPHP = C3;
                    orderCode = "C3";
                    productUSD = "C3 - USD " + String.format("%.2f", (C3 / exchangeRate));
                    break;
            }

            System.out.print("Enter the quantity for the main menu: ");
            mainMenuQty = scan.nextInt();
            totalPHP *= mainMenuQty;

            System.out.println("\nAdd Ons: ");
            System.out.println("1. R1 - Php 35.00");
            System.out.println("2. R2 - Php 50.00");
            System.out.println("3. No add ons");
            System.out.print("Choose Add Ons: ");
            int choice = scan.nextInt();
            
            float addonsPHP = 0.00f;
            String addonsUSD = "";

            switch (choice) {
                case 1:
                    System.out.print("Enter the quantity of R1: ");
                    int qtyR1 = scan.nextInt();
                    addonsPHP += R1 * qtyR1;
                    orderCode += " + R1 x" + qtyR1;
                    productUSD += " + R1 x" + qtyR1 + " - USD " + String.format("%.2f", (R1 * qtyR1 / exchangeRate));
                    addonsQty = qtyR1;
                    break;
                case 2:
                    System.out.print("Enter the quantity of R2: ");
                    int qtyR2 = scan.nextInt();
                    addonsPHP += R2 * qtyR2;
                    orderCode += " + R2 x" + qtyR2;
                    productUSD += " + R2 x" + qtyR2 + " - USD " + String.format("%.2f", (R2 * qtyR2 / exchangeRate));
                    addonsQty = qtyR2;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice of add ons.");
                    return;
            }

            float totalUSD = (totalPHP + addonsPHP) / exchangeRate;

            System.out.println("\nOrder Receipt");
            System.out.println("Order: " + orderCode);
            System.out.println("Quantity of Main Menu: " + mainMenuQty);
            System.out.println("Quantity of Add-Ons: " + addonsQty);
            System.out.println("Total Price in (PHP): Php " + String.format("%.2f", (totalPHP + addonsPHP)));
            System.out.println("Total Price in (USD): USD " + String.format("%.2f", totalUSD));
            System.out.println("Product Prices in USD: " + productUSD);
        }
    }
}
