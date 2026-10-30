import java.util.*;

class A3a {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int s3 = sc.nextInt();

        System.out.print("Enter marks of subject 4: ");
        int s4 = sc.nextInt();

        System.out.print("Enter marks of subject 5: ");
        int s5 = sc.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;

        double percentage = total / 5.0;

        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}