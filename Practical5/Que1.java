package Practical5;
import java.util.Scanner;

class Product
{
    double MRP;
    int QUANTITY;

    void display()
    {
        System.out.println("MRP of product : " + MRP);
        System.out.println("QUANTITY of product : " + QUANTITY);
    }

    void setdata()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the MRP of product : ");
        this.MRP = sc.nextDouble();

        System.out.print("Enter the quantity of product : ");
        this.QUANTITY = sc.nextInt();
    }
}

class Crockery extends Product
{
    Crockery()
    {
        System.out.println("Crokery is added.");
    }
}

class Household extends Product
{
    Household()
    {
        System.out.println("Household is added.");
    }
}

class Food_items extends Product
{
    Food_items()
    {
        System.out.println("Food_items is added.");
    }
}

class Que1
{
    public static void main(String[] args)
    {
        Crockery c1 = new Crockery();
        c1.setdata();
        c1.display();
        System.out.println();

        Household h1 = new Household();
        h1.setdata();
        h1.display();
        System.out.println();


        Food_items f1 = new Food_items();
        f1.setdata();
        f1.display();

    }
}
