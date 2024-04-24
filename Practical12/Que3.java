package Practical12;

import Practical6.P6Q3.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Student details");
            System.out.println("2. Update Student Details");
            System.out.println("3. Search for a Student");
            System.out.println("4. Delete Student Details");
            System.out.println("5. Show All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Student newStudent = new Student();
                    newStudent.setdata();
                    students.add(newStudent);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Enrollment no. to update: ");
                    int updateEnrollmentNo = sc.nextInt();
                    boolean foundUpdate = false;
                    for (Student student : students) {
                        if (student.Enrollment_no == updateEnrollmentNo) {
                            student.updateData();
                            foundUpdate = true;
                            break;
                        }
                    }
                    if (!foundUpdate) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Enrollment no. to search: ");
                    int searchEnrollmentNo = sc.nextInt();
                    boolean foundSearch = false;
                    for (Student student : students) {
                        if (student.Enrollment_no == searchEnrollmentNo) {
                            student.display();
                            foundSearch = true;
                            break;
                        }
                    }
                    if (!foundSearch) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Enrollment no. to delete: ");
                    int deleteEnrollmentNo = sc.nextInt();
                    boolean foundDelete = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).Enrollment_no == deleteEnrollmentNo) {
                            students.remove(i);
                            System.out.println("Student deleted successfully.");
                            foundDelete = true;
                            break;
                        }
                    }
                    if (!foundDelete) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 5:
                    System.out.println("All Students:");
                    for (Student student : students) {
                        student.display();
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }
    }
}
