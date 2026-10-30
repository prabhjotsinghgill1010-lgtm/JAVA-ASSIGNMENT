import java.util.*;

class A3c {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter electricity unit consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 3;
        }
        else if (units <= 500) {
            bill = (100 * 3) + ((units - 100) * 5);
        }
        else {
            bill = (100 * 3) + (400 * 4) + ((units - 500) * 6);
        }

        System.out.println("Electricity Bill = " + bill);
    }
}