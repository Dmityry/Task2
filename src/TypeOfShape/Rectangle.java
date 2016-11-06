package TypeOfShape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Дмитрий on 03.11.2016.
 */
public class Rectangle implements IShape {
    double sideOne, sideTwo, diagonal;

    public Rectangle() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter side of Rectangle a and b: ");
        String sideOneString = reader.readLine();
        String sideTwoString = reader.readLine();
        sideOne = Double.parseDouble(sideOneString);
        sideTwo = Double.parseDouble(sideTwoString);
        System.out.println("Area of Rectangle = " + calculateArea());
        System.out.println("Perimeter of Rectangle = " + calculatePerimeter());
        System.out.println("Area of triangle in this Rectangle = " + calculateAreaOfTriangleInSquare());
        System.out.println("Perimeter of triangle in this Rectangle = " + calculatePerimeterOfTriangleInSquare());

        diagonal = Math.sqrt(Math.pow(sideOne, 2) + Math.pow(sideTwo, 2));
    }

    @Override
    public double calculateArea() {
        return (sideOne * sideTwo);
    }

    @Override
    public double calculatePerimeter() {
        return (2 * (sideOne + sideTwo));
    }

    public double calculateAreaOfTriangleInSquare() {
        double p;
        p = (sideOne + sideTwo + diagonal) / 2;

        return (Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - diagonal)));
    }

    public double calculatePerimeterOfTriangleInSquare() {
        return (sideOne + sideTwo + diagonal);
    }
}
