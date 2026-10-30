import java.lang.*;

class ASSIG1 {
    public static void main(String args[]) {

        double len = 5.0, bnd = 4.0, hgt = 3.0;

        double vRectangle = len * bnd * hgt;
        double vCube = len * len * len;
        double aSquare = len * len;

        System.out.println("Volume of rectangle = "
                + vRectangle);

        System.out.println("Volume of cube = "
                + vCube);

        System.out.println("Area of square = "
                + aSquare);
    }
}