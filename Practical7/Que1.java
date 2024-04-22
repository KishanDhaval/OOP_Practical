/*Define three objects for all the classes named- Crockery, 
Household, Food-items and store the initial values for all the 
objects in arraylist or collection. */

import java.util.*;

interface Place{
	void setPlace();
}

class Product
{	
    String NAME;
    double MRP;
    int QUANTITY;

    void display()
    {
	System.out.println("Name of product : " + NAME);
        System.out.println("MRP of product : " + MRP);
        System.out.println("QUANTITY of product : " + QUANTITY);
	System.out.println();
    }

    void setData()
    {
        Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the NAME of product : ");
        this.NAME = sc.nextLine();

        System.out.print("Enter the MRP of product : ");
        this.MRP = sc.nextDouble();

        System.out.print("Enter the quantity of product : ");
        this.QUANTITY = sc.nextInt();
    }
}

class Crockery extends Product implements Place
{
	String place;

    Crockery()
    {
        System.out.println("Crokery is added.");
    }
	public void setPlace(){
		  Scanner sc = new Scanner(System.in);
		System.out.print("Enter place : ");
      	        this.place = sc.nextLine();	
	}
   	 void display() {
        	super.display();
        	System.out.println("Place : " + place);
    	}
	
	
}

class Household extends Product implements Place
{
String place;
    Household()
    {
        System.out.println("Household is added.");
    }
	public void setPlace(){
		  Scanner sc = new Scanner(System.in);
		System.out.print("Enter place : ");
      	        this.place = sc.nextLine();	
	}
   	 void display() {
       		 super.display();
        	System.out.println("Place : " + place);
   	 }
	
	
}

class Food_items extends Product implements Place
{
String place;
    Food_items()
    {
        System.out.println("Food_items is added.");
    }
	public void setPlace(){
		 Scanner sc = new Scanner(System.in);
		System.out.print("Enter place : ");
      	        this.place = sc.nextLine();	
	}
    	 void display() {
       		 super.display();
       		 System.out.println("Place : " + place);
   	 }
	
}



class Que1
{

	  public static void arraylist() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.println("How many Crockery Product :");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            Crockery c = new Crockery();
	    c.setPlace();
            c.setData();
            products.add(c);
        }

        System.out.println("How many House-Hold Product :");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            Household h = new Household();
	    h.setPlace();
            h.setData();
            products.add(h);
        }

        System.out.println("How many Food-items Product :");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            Food_items f = new Food_items();
	    f.setPlace();
            f.setData();
            products.add(f);
        }

        // Displaying all accounts
        System.out.println("Accounts Detail!!:");
        for (Product pdc : products) {
            pdc.display();
        }
    }

    public static void main(String[] args) {
        arraylist();
    }


}







/*    public static void main(String[] args)
    {

	ArrayList<Product> items = new ArrayList<>();

	Crockery plate =new Crockery();
	plate.setdata();
	Crockery cups =new Crockery();
	cups.setdata();
	Crockery jug =new Crockery();
	jug.setdata();
	
         items.add(plate);
         items.add(cups);
         items.add(jug);


	Household chair=new Household();
	chair.setdata();
	Household table=new Household();
	table.setdata();
	Household bad=new Household();
	bad.setdata();

         items.add(chair);
         items.add(table);
         items.add(bad);


	Food_items apple=new Food_items();
	apple.setdata();
	Food_items mango=new Food_items();
	mango.setdata();
	Food_items banana=new Food_items();
	banana.setdata();

         items.add(apple);
         items.add(mango);
         items.add(banana);

         System.out.println("Items are");
	  for (Product item : items) {
             item.display();
         }

}}

*/
	


	