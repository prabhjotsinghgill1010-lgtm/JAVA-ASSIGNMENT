import java.lang.*;

class A2b2 {
    public static void main(String args[]) {

        double kg = 70, m = 1.78, bmi;

        bmi = kg / (m * m);

        System.out.println("Weight: " + kg + " kg");
        System.out.println("Height: " + m + " m");
        System.out.println("Calculated BMI: " + bmi);
    }
}