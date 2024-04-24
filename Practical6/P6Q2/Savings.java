package Practical6.P6Q2;
import Practical6.P6Q2.Account;
import Practical6.P6Q2.Branch;



public class Savings extends Account implements Branch
{
    Savings()
    {
        System.out.println("Savings Account is added.");
    }
	public void search(){
		System.out.println("Saving Account searching... Around IFSC code : " + IFSC);
	}
}