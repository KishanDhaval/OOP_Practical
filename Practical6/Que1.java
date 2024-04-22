import java.util.Scanner;

interface Place {
    void search();
    int BlockNo = 0;
}

class Product {
    double MRP;
    int QUANTITY;

    void display() {
        System.out.println("-->MRP of product : " + MRP);
        System.out.println("-->QUANTITY of product : " + QUANTITY);
	System.out.println();
    }

    void setdata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the MRP of product : ");
        this.MRP = sc.nextDouble();

        System.out.print("Enter the quantity of product : ");
        this.QUANTITY = sc.nextInt();
	System.out.println();

    }
}

class Crockery extends Product implements Place {
    Crockery() {
        System.out.println("Crockery is added.");
    }

    @Override
    public void search() {
        System.out.println("Crockery Product Searching... \n Searching in Block Number : " + BlockNo);
    }
}

class Household extends Product implements Place {
    Household() {
        System.out.println("Household is added.");
    }

    @Override
    public void search() {
        System.out.println("House Hold Product Searching... \n Searching in Block Number : " + BlockNo);
    }
}

class Food_items extends Product implements Place {
    Food_items() {
        System.out.println("Food_items is added.");
    }

    @Override
    public void search() {
        System.out.println("Food Items Searching... \n Searching in Block Number :  " + BlockNo);
    }
}

public class Que1 {
    public static void main(String[] args) {
        Crockery c1 = new Crockery();
        c1.setdata();
        c1.search();
        c1.display();
        System.out.println();

        Household h1 = new Household();
        h1.setdata();
        h1.search();
        h1.display();
        System.out.println();

        Food_items f1 = new Food_items();
        f1.setdata();
        f1.search();
        f1.display();
    }
}
