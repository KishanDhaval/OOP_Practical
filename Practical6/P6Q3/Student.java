package Practical6.P6Q3;

import java.util.*;



public class Student {
    public int Enrollment_no;
    public String Name;

   public  void display() {
        System.out.println("Enrollment_no : " + Enrollment_no);
        System.out.println("Name : " + Name);
    }

    public void setdata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Enrollment no. : ");
        this.Enrollment_no = sc.nextInt();

        System.out.print("Enter the name : ");
        this.Name = sc.next();

    }

    public void updateData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Update Student Data:");
        System.out.print("Enter the new Enrollment no.: ");
        this.Enrollment_no = sc.nextInt();

        System.out.print("Enter the new name: ");
        this.Name = sc.next();
        System.out.println("Student data updated successfully.");
    }
}
