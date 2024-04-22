class Student{
    static int Enrollment_no;
    String Name;
    Student(){
        System.out.println("Welcome to Student-Information system.");
    }

    Student(int en_no, String name){
        Enrollment_no = en_no;
        Name = name;
    }

    void display(){
        System.out.println("Enrollment_no : " + Enrollment_no);
        System.out.println("Name : " + Name);
    }
}

class Que3{
    public static void main(String[] args){
        int en_no = Integer.parseInt(args[0]);
        String name = args[1];

        Student s1 = new Student();
        Student s2 = new Student(en_no, name);
        s2.display();
    }
}
