class SimpleInterest {

    void calculateSI(double principal, double rate, double time) {
        double SI = (principal * rate * time) / 100;

        System.out.println("Principal = " + principal);
        System.out.println("Rate = " + rate);
        System.out.println("Time = " + time);
        System.out.println("Simple Interest = " + SI);
    }

    void calculateSI(double principal, double time) {
        double rate = 5;
        calculateSI(principal, rate, time);
    }

    void calculateSI(double principal) {
        double rate = 5;
        double time = 1;
        calculateSI(principal, rate, time);
    }

    public static void main(String args[]) {

        SimpleInterest obj = new SimpleInterest();

        System.out.println("Using Principal, Rate and Time:");
        obj.calculateSI(1000, 8, 2);

        System.out.println("\nUsing Principal and Time:");
        obj.calculateSI(1000, 2);

        System.out.println("\nUsing Principal:");
        obj.calculateSI(10000);
    }
}