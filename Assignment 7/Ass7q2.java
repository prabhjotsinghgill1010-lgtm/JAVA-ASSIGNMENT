import java.util.Scanner;

class Student {
    String name;
    int rollno;
    String course;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    void courseOptions() {
        System.out.println("Available Courses:");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C++");
        System.out.println("4. Web Development");
    }

    void selectCourse(int choice) {
        switch (choice) {
            case 1:
                course = "Java";
                break;

            case 2:
                course = "Python";
                break;

            case 3:
                course = "C++";
                break;

            case 4:
                course = "Web Development";
                break;

            default:
                course = "Invalid Course";
        }
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Course Selected: " + course);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student("Amit", 101);

        s.courseOptions();

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        s.selectCourse(choice);
        s.display();

        sc.close();
    }
}