package Practical9;


import java.util.Scanner;

class Que3{
	
	static void searchStudent(String Name)throws Exception{
		String []names=new String[5];
		names[0]="kishan";
		names[1]="dhaval";
		names[2]="aman";
		names[3]="ajay";
		names[4]="chirag";

		try{
			int flag=0;
			 for (String name : names) {
                		if (Name.equals(name)) {
                   		 flag = 1;
                   		 break;
                		}
            		}	
			if(flag==1){System.out.println("Name is found!!");}
			else {throw new Exception("Name is not found!!");}
		}catch(Exception e){
			System.out.println("Error :"+ e.getMessage());
		}
		
		
	}


	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of the student :");
		String name=sc.nextLine();

		try{
			searchStudent(name);
		}catch(Exception e){
			System.out.println("Error"+ e.getMessage());
		
		}	
}
}