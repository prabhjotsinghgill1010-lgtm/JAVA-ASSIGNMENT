 class Calculate {
    public static void main(String[] args) {
        double e = 1.0;
        double factorial = 1.0;

        for (int i = 1; i <= 5; i++) {
            factorial = factorial * i;
            e = e + (1.0 / factorial);
        }

        System.out.println("Value of e = " + e);
    }
}