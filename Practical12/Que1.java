package Practical12;

import Practical6.Que1.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class Que1 {
    static ArrayList<Product> products = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    setValues();
                    break;
                case 2:
                    buyProduct();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    showData();
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a number from the menu.");
            }
        }
    }

    static void menu() {
        System.out.println("\nMenu:");
        System.out.println("1. Set values for a product");
        System.out.println("2. Buy a product");
        System.out.println("3. Search for a product");
        System.out.println("4. Delete a product from storage");
        System.out.println("5. Show stored object data");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    static void setValues() {
        System.out.println("\nSetting values for a product:");
        Product product = new Product();
        product.setdata();
        products.add(product);
        System.out.println("Product added.");
    }

    static void buyProduct() {
        System.out.println("\nBuying a product:");
        System.out.print("Enter Index of the product to buy: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index >= 0 && index < products.size()) {
            Product product = products.get(index);
            if (product.QUANTITY > 0) {
                product.QUANTITY--;
                System.out.println("Product bought successfully.");
            } else {
                System.out.println("Product out of stock.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    static void searchProduct() {
        System.out.println("\nSearching for a product:");
        System.out.print("Enter Index of the product to search: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index >= 0 && index < products.size()) {
            Product product = products.get(index);
            product.display();
        } else {
            System.out.println("Invalid index.");
        }
    }

    static void deleteProduct() {
        System.out.println("\nDeleting a product from storage:");
        System.out.print("Enter Index of the product to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index >= 0 && index < products.size()) {
            products.remove(index);
            System.out.println("Product deleted.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    static void showData() {
        System.out.println("\nShowing stored object data:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Product " + i + ":");
            products.get(i).display();
        }
    }
}
