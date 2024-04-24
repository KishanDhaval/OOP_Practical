package Practical6.P6Q1;

import java.util.Scanner;

public class Product {
   public double MRP;
   public int QUANTITY;

    public void display() {
        System.out.println("-->MRP of product : " + MRP);
        System.out.println("-->QUANTITY of product : " + QUANTITY);
        System.out.println();
    }

   public void setdata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the MRP of product : ");
        this.MRP = sc.nextDouble();

        System.out.print("Enter the quantity of product : ");
        this.QUANTITY = sc.nextInt();
        System.out.println();

    }
}
