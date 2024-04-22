import java.util.*;

class Account{
	int Ac_No;
	String Name;
	int Balance;
	
	void display(){
		System.out.println("Ac_No : "+Ac_No);
		System.out.println("Name : "+Name);
		System.out.println("Balance : "+Balance);
	}
	void setdata(int Ac_No , String Name, int Balance){
		this.Ac_No=Ac_No;
		this.Name=Name;
		this.Balance=Balance;
	}
	
	void deposit(int Amount){
		this.Balance+=Amount;
	}
}

class Que2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Account a1 = new Account();
		a1.setdata(100 , "Yash" , 20000);
		System.out.println("Enter Deposit Amount : ");
		int Amount =sc.nextInt();
		a1.deposit(Amount);
		a1.display(); 
	}
}