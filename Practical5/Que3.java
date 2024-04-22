/*
Create a interface named Result with method getMarks() and 
variable percentage and implement it together on all the above 
classes. in getMarks() get the marks of 3 subjects and 
calculate the average inside the method.
*/
import java.util.*;

class Student
{
    int Enrollment_no;
    String Name;

    void display()
    {
        System.out.println("Enrollment_no : " + Enrollment_no);
        System.out.println("Name : " + Name);
    }

    void setdata()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Enrollment no. : ");
        this.Enrollment_no = sc.nextInt();

        System.out.print("Enter the name : ");
        this.Name = sc.next();

    }
}

class BE extends Student 
{
    int EntryYear;
    final int Duration = 4;

	BE(){
		System.out.println("BE Student !!");
	}
    void setdata()
    {
	super.setdata();
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Entry Year ");
	this.EntryYear = sc.nextInt();
	System.out.println();
    }

    void display()
    {
        super.display();
        System.out.println("Entry Year : " + this.EntryYear);
        System.out.println("Duration of course : " + Duration);
    }
}

class ME extends Student 
{
    int EntryYear;
    final int Duration = 2;

	ME(){
		System.out.println("ME Student !!");
	}

    void setdata()
    {
	super.setdata();
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Entry Year ");
	this.EntryYear = sc.nextInt();
	System.out.println();
    }


    void display()
    {
        super.display();
        System.out.println("Entry Year : " + EntryYear);
        System.out.println("Duration of course : " + Duration);
    }
}

class Que3
{
    public static void main(String args[])
    {
        BE b1 = new BE();
        b1.setdata();
        b1.display();
        System.out.println();

        ME m1 = new ME();
        m1.setdata();
        m1.display();
    }
}
