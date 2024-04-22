/*
Create an interface named Branch with method search() and 
variable IFSC Code and implement it together on all the 
above classes.
*/

import java.util.Scanner;

interface Branch{
	void search();
	String IFSC="BAR0HAIJX";
}

class Account 
{
    int Ac_No;
    String Name;
    double Balance;

    void display()
    {
        System.out.println("Account no. : " + Ac_No);
        System.out.println("Name : " + Name);
        System.out.println("Balance : " + Balance);
	System.out.println();
    }

    void setData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account no. : ");
        this.Ac_No = sc.nextInt();

        System.out.print("Enter the name : ");
        this.Name = sc.next();

        System.out.print("Enter the Balance : ");
        this.Balance = sc.nextDouble();
	System.out.println();
    }

    void deposit()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to deposit : ");
        double Deposit = sc.nextDouble();

        Balance = Balance + Deposit;
    }
}

class Savings extends Account implements Branch
{
    Savings()
    {
        System.out.println("Savings Account is added.");
    }
	public void search(){
		System.out.println("Saving Account searching... Around IFSC code : " + IFSC);
	}
}

class Current extends Account implements Branch
{
    Current()
    {
        System.out.println("Current Account is added.");
    }
	public void search(){
		System.out.println("Current Account searching... with IFSC code : " + IFSC);
	}
}

class Que2
{
    public static void main(String[] args)
    {
        Savings s1 = new Savings();
        s1.setData();
	s1.search();
        s1.display();
        s1.deposit();
        s1.display();
        System.out.println();

        Current c1 = new Current();
        c1.setData();
	c1.search();
        c1.display();
        c1.deposit();
        c1.display();
    }

}
