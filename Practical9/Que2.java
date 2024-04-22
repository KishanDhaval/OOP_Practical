package Practical9;
import java.util.*;



class Que2{

	static void withdraw(int Withdraw) throws Exception{
		int Balance=1000;
		
		try{
			if(Balance < Withdraw){
				throw new Exception("NO sufuciant Amount in Account!!");
			}
			else{
				Balance-=Withdraw;
				System.out.println("Remainig Balance : "+Balance);
			}
		}
		catch(Exception e){
			System.out.println("error aavi :" + e.getMessage());
		}
		
	}

	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		
  System.out.println("Enter Amount you want to Withdraw: ");
        int withdraw = sc.nextInt();
        try {
            withdraw(withdraw);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}