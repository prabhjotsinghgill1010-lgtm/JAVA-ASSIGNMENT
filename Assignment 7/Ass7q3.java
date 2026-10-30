class Area {

    static void rectangleArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }

    void squareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square = " + area);
    }

    public static void main(String[] args) {

        Area.rectangleArea(10, 5);

        Area obj = new Area();
        obj.squareArea(6);
    }
}