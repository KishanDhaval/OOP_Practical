package Practical6.P6Q3;


import Practical6.P6Q3.Result;
import Practical6.P6Q3.Student;
import java.util.*;



public class BE extends Student implements Result {
    int sub1, sub2, sub3;
    double percentage;
    int EntryYear;
    final int Duration = 4;

    public BE() {
        System.out.println("BE Student !!");
    }

    public void setdata() {
        super.setdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Entry Year ");
        this.EntryYear = sc.nextInt();
        System.out.println();
    }

    public void display() {
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