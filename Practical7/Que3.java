import java.util.*;

interface Result{
	void setResult();
}

class Student
{
    int Enrollment_no;
    String Name;

    void display()
    {
        System.out.println("Enrollment_no : " + Enrollment_no);
        System.out.println("Name : " + Name);
    }

    void setData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Enrollment_no. : ");
        this.Enrollment_no = sc.nextInt();

        System.out.print("Enter the name : ");
        this.Name = sc.next();
    }
}

class BE extends Student implements Result
{
    int EntryYear;
    final int Duration = 4;
	double result;
    void setData()
    {
	super.setData();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the EntryYear : ");
        this.EntryYear = sc.nextInt();
    }

    void display()
    {
        super.display();
        System.out.println("Entry Year : " + this.EntryYear);
        System.out.println("Duration of course : " + Duration);
	System.out.println("Result :"+result+" CGPA");
    }
	
	public void setResult(){
		 Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the Result in CGPA : ");
        	this.result = sc.nextInt();
	}
}

class ME extends Student implements Result
{
    int EntryYear;
    final int Duration = 2;
	double result;

    void setData()
    {
	super.setData();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the EntryYear : ");
        this.EntryYear = sc.nextInt();
    }

    void display()
    {
        super.display();
        System.out.println("Entry Year : " + EntryYear);
        System.out.println("Duration of course : " + Duration);
	System.out.println("Result :"+result+" CGPA");
    }

	public void setResult(){
		 Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the Result in CGPA : ");
        	this.result = sc.nextInt();
	}
}


class Que3 {
    public static void arraylist() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("How many BE Students :");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            BE b = new BE();
	    b.setResult();
            b.setData();
            students.add(b);
        }

        System.out.println("How many ME Students :");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            ME m = new ME();
	    m.setResult();
            m.setData();
            students.add(m);
        }

        // Displaying all Students
	System.out.println();
        System.out.println("Student Detail!!:");
        for (Student std : students) {
            std.display();
        }
    }

    public static void main(String[] args) {
        arraylist();
    }
}