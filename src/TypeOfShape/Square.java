package TypeOfShape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Дмитрий on 03.11.2016.
 */
public class Square implements IShape {

    private double side, diagonal;

    public Square() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter one side of square: ");
        String inputRadius = reader.readLine();
        side = Double.parseDouble(inputRadius);
        diagonal = side * Math.sqrt(2);
        System.out.println("Area of square = " + calculateArea());
        System.out.println("Perimeter of square = " +calculatePerimeter());
        System.out.println("Area of triangle in this square = " + calculateAreaOfTriangleInSquare());
        System.out.println("Perimeter of triangle in this square = " +calculatePerimeterOfTriangleInSquare());
    }

    @Override
    public double calculateArea() {
        return (Math.pow(side, 2));
    }

    @Override
    public double calculatePerimeter() {
        return (4 * side);
    }

    public double calculateAreaOfTriangleInSquare() {
        double p;
        p = (side + side + diagonal) / 2;

        return (Math.sqrt(p * (p - side) * (p - side) * (p - diagonal)));
    }

    public double calculatePerimeterOfTriangleInSquare() {
        return (side + side + diagonal);
    }

}