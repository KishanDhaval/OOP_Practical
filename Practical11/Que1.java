/*Create customer class which extends thread class and 
contains two instance variables name, ProductName and static 
variable Product Quantity. For example if two customers are 
trying to buy the same product at once then follow 
synchronization of two customers extending thread class. */


package Practical11;

class customer extends Thread {
	String Name;
	String ProductName;
	static int Quantity=10;

	customer(String n , String pn){
		this.Name=n;
		this.ProductName=pn;
	}

	public void run(){
       	 synchronized (customer.class) { 

 		if (Quantity > 0) {
			System.out.println("Name  : " + Name+ "\t Product Name : "+ProductName);
			Quantity--;
			System.out.println(" Remaining Number of product : " + Quantity);
		}
		 else {
                	System.out.println("Sorry, " + Name + ". " + ProductName + " is out of stock.");
            	}
	 }
	}
}

class Que1{
	public static void main(String []args){

		customer c1= new customer("Kishan" , "Laptop");
		customer c2= new customer("Yash" , "Mouse");
		c1.start();
		c2.start();

	}

}