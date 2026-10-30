import java.util.Scanner;

public class ASS4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("It is not a quadratic equation");
        } else {
            double D = (b * b) - (4 * a * c);

            if (D > 0) {
                double r1 = (-b + Math.sqrt(D)) / (2 * a);
                double r2 = (-b - Math.sqrt(D)) / (2 * a);

                System.out.println("The equation has real and distinct roots:");
                System.out.printf("1st Root = %.2f\n", r1);
                System.out.printf("2nd Root = %.2f\n", r2);
            } else if (D == 0) {
                double r = -b / (2 * a);

                System.out.println("The equation has real and equal roots:");
                System.out.printf("1st Root = 2nd Root = %.2f\n", r);
            } else {
                double realP = -b / (2 * a);
                double imgP = Math.sqrt(-D) / (2 * a);

                System.out.println("The equation has complex roots:");
                System.out.printf("1st Root = %.2f + %.2fi\n", realP, imgP);
                System.out.printf("2nd Root = %.2f - %.2fi\n", realP, imgP);
            }
        }

        sc.close();
    }
}