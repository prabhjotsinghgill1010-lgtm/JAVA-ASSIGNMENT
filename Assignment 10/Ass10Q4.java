class Student {
    int rollNo;
    String name;

    static String college = "ABC College";

    static {
        System.out.println("Static block executed");
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    static void changeCollege() {
        college = "XYZ College";
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

public class Ass10Q4 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Aman");

        s1.display();
        s2.display();

        Student.changeCollege();

        System.out.println("\nAfter changing college:");

        s1.display();
        s2.display();
    }
}