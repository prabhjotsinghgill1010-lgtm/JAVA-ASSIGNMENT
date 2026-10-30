import java.util.*;

class A3b {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = 10.0 / 100 * basicSalary;
        double da = 60.0 / 100 * basicSalary;

        double grossSalary = basicSalary + hra + da;

        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Gross Salary = " + grossSalary);
    }
}