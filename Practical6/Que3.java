import java.util.*;

interface Result {
    void getMarks(int a, int b, int c);
}

class Student {
    int Enrollment_no;
    String Name;

    void display() {
        System.out.println("Enrollment_no : " + Enrollment_no);
        System.out.println("Name : " + Name);
    }

    void setdata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Enrollment no. : ");
        this.Enrollment_no = sc.nextInt();

        System.out.print("Enter the name : ");
        this.Name = sc.next();

    }
}

class BE extends Student implements Result {
    int sub1, sub2, sub3;
    double percentage;
    int EntryYear;
    final int Duration = 4;

    BE() {
        System.out.println("BE Student !!");
    }

    void setdata() {
        super.setdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Entry Year ");
        this.EntryYear = sc.nextInt();
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("Entry Year : " + this.EntryYear);
        System.out.println("Duration of course : " + Duration);
        System.out.println("Percentage: " + this.percentage);
    }

    public void getMarks(int mark1, int mark2, int mark3) {
        sub1 = mark1;
        sub2 = mark2;
        sub3 = mark3;
        percentage = (sub1 + sub2 + sub3) / 3.0;
    }
}

class ME extends Student implements Result {
    int sub1, sub2, sub3;
    double percentage;
    int EntryYear;
    final int Duration = 2;

    ME() {
        System.out.println("ME Student !!");
    }

    void setdata() {
        super.setdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Entry Year ");
        this.EntryYear = sc.nextInt();
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("Entry Year : " + EntryYear);
        System.out.println("Duration of course : " + Duration);
        System.out.println("Percentage: " + percentage);
    }

    public void getMarks(int mark1, int mark2, int mark3) {
        sub1 = mark1;
        sub2 = mark2;
        sub3 = mark3;
        percentage = (sub1 + sub2 + sub3) / 3.0;
    }

}

public class Que3 {
    public static void main(String args[]) {
        BE b1 = new BE();
        b1.setdata();
        b1.getMarks(80, 90, 70);
        b1.display();
        System.out.println();

        ME m1 = new ME();
        m1.setdata();
        m1.getMarks(80, 60, 70);
        m1.display();
    }
}
