package Practical6.P6Q2;
import Practical6.P6Q2.Account;
import Practical6.P6Q2.Branch;




public class Current extends Account implements Branch
{
    Current()
    {
        System.out.println("Current Account is added.");
    }
	public void search(){
		System.out.println("Current Account searching... with IFSC code : " + IFSC);
	}
}