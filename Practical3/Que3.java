import java.util.*;

class Student{
	static long Enrollment_No=220280116100L;
	String Name;
	
	void display(){
		System.out.println("Enrollment_No : "+Enrollment_No);
		System.out.println("Name : "+Name);
		this.Enrollment_No++;
	}
	void setdata(String Name){
		this.Name=Name;
	}
}


class Que3{

	public static void main(String args[]){

		Student s1 = new Student();
		s1.setdata( "Kishan");
		s1.display(); 

   		Student s2 = new Student();
		s2.setdata( "Yash");
		s2.display();
	}

}