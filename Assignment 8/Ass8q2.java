class Rectangle{
    double width;
    double height;
    public Rectangle(double width , double height){
        this.height = height;
        this.width = width;
    }
    public void area(){
        double a = width*height;
        System.out.println("The area of rectangle = "+a);
    }
    public void perimeter(){
        double p = 2*(height + width);
        System.out.println("The perimeter of rectangle = "+p);

    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.2,5.5);
        r1.area();
        r1.perimeter();
    }
}