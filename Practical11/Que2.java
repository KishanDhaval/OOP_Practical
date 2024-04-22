/*Create Customer class which extends thread class and 
contains two instance variables name, BankName and static 
variable Product Balance. if two customers are trying to 
Withdraw from the same Account at once then then follow 
synchronization of two customers extending thread class. */

package Practical11;
import java.util.*;
class Customer extends Thread{
	String Name ;
	String BankName;
	static int Balance = 1000 ;
	int Amount;
	
	Customer(String n , String bn ){
		Scanner sc= new Scanner(System.in);

		System.out.println("How many amount you want to Withdrow : ");
		this.Amount = sc.nextInt();
		this.Name=n;
		this.BankName=bn;		
	}	 

	public void run(){
       	 synchronized (Customer.class) { 
		if(Balance > 0){
			System.out.println("Name : " + Name + "\n Withdrowing Amount :" + Amount );
			Balance-=Amount;
			System.out.println("Name : " + Name + "\n Bank Name : "+ BankName );
			
		}else {
                	System.out.println("Sorry, " + Name + ". Insufficient funds in " + BankName);
           	}
	 }

	}
}

class Que2{

	public static void main(String args[]){
		Customer c1= new Customer("Kishan" , "Bank of Baroda");
		Customer c2 =new Customer("Yash" , "Bank of India");
		c1.start();
		c2.start();

	}

}