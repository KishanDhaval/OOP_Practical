package Practical6.P6Q3;



import Practical6.P6Q3.Result;
import Practical6.P6Q3.Student;
import Practical6.P6Q3.BE;
import Practical6.P6Q3.ME;





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
