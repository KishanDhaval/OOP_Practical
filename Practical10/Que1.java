
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

interface Place{
	void setPlace(String p);
}

class Product
{	
    String NAME;
    double MRP;
    int QUANTITY;
	
	Product(String n , double mrp , int q){
		this.NAME = n;
       		 this.MRP = mrp;
	        this.QUANTITY =q;
	}

}

class Crockery extends Product implements Place
{
	String place;

    Crockery(String n , double mrp , int q)
    {	
	super(n , mrp , q);
        System.out.println("Crokery is added.");
    }
	public void setPlace(String p){
      	        this.place = p;	
	}	
}

class Household extends Product implements Place
{
String place;
    Household(String n , double mrp , int q)
    {
	super(n , mrp , q);
        System.out.println("Household is added.");
    }
	public void setPlace(String p){
      	        this.place = p;	
	}	
}

class Food_items extends Product implements Place
{
String place;
    Food_items(String n , double mrp , int q)
    {
	super(n , mrp , q);
        System.out.println("Food_items is added.");
    }
	public void setPlace(String p){
      	        this.place = p;	
	}
}



class Que1
{

	  public static void arraylist() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();


              Crockery c = new Crockery("Plate" , 60 , 6);
	    c.setPlace("Ahmedabad");
            products.add(c);


             Household h = new Household("Bad" ,1200,1);
	    h.setPlace("Harij");
            products.add(h);


   
            Food_items f = new Food_items("Banana" , 60 , 12);
	    f.setPlace("Patan");
            products.add(f);

        writeToTextFile(products);
    }

    private static void writeToTextFile(ArrayList<Product> Products) {
        try (FileWriter writer = new FileWriter("productdata.txt")) {
            for (Product acc : product) {
                writer.write("\Product Information\n");
                writer.write("Product Name: " + acc.NAME+ "\n");
                writer.write("Product MRP: " + acc.MRP + "\n");
                writer.write("Produc Quantity: " + acc.QUANTITY + "\n");
                writer.write("Place: " + acc.place + "\n");
                writer.write("---------------------------\n");
            }

            System.out.println("Data stored to accountdata.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while saving account data to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        arraylist();
    }
}
