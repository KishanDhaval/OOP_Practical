
import java.io.PrintWriter;
import java.util.*;

interface Result {
    void setResult(double result);
}

class Student {
    int enrollmentNo;
    String name;
    double result;

    Student(int enl, String n) {
        this.enrollmentNo = enl;
        this.name = n;
    }
}

class BE extends Student implements Result {
    int entryYear;
    final int duration = 4;

    BE(int enl, String n) {
        super(enl, n);
        System.out.println("BE Student: " + name);
    }

    @Override
    public void setResult(double r) {
        this.result = r;
    }
}

class ME extends Student implements Result {
    int entryYear;
    final int duration = 2;

    ME(int enl, String n) {
        super(enl, n);
        System.out.println("ME Student: " + name);
    }

    @Override
    public void setResult(double r) {
        this.result = r;
    }
}

public class Que3 {
    public static void arraylist() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        BE b = new BE(100, "Kishan");
        b.setResult(9.0);
        students.add(b);

        ME m = new ME(90, "Yash");
        m.setResult(8.0);
        students.add(m);

        saveToFile(students);
    }

    public static void saveToFile(ArrayList<Student> students) {
        try (PrintWriter writer = new PrintWriter("student_info.txt")) {
            for (Student student : students) {
                writer.write("Name: " + student.name + ", Enrollment No: " + student.enrollmentNo +
                        ", Result (CGPA): " + student.result + "\n");
            }
            System.out.println("Student information saved to student_info.txt");
        } catch (Exception e) {
            System.out.println("An error occurred while saving student data to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        arraylist();
    }
}
