package Practical9;
import java.util.Scanner;



public class Que1 {


 static void buy(int buyQuantity) {
    String name="Banana";
    int quantity=10;
        try {
            if (buyQuantity > quantity) {
                throw new Exception("Insufficient Quantity");
            } else {
                quantity -= buyQuantity;
                System.out.println("Purchase Successful. Available quantity: " + quantity);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("How many bananas you want to buy?");
        int buyQuantity = scanner.nextInt();

      	buy(buyQuantity);


        scanner.close();
    }
}
