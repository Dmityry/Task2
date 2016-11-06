package shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Дмитрий on 03.11.2016.
 */
public class Rectangle implements IShape {

    private double sideOne, sideTwo;

    @Override
    public void fetchParameters() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter side of Rectangle a and b: ");
        sideOne = Double.parseDouble(reader.readLine());
        sideTwo = Double.parseDouble(reader.readLine());
    }

    @Override
    public void printResult() {
        System.out.println("Area of Rectangle = " + calculateArea());
        System.out.println("Perimeter of Rectangle = " + calculatePerimeter());

        Triangle triangle = new Triangle(sideOne, sideTwo);
        triangle.printResult();
    }

    @Override
    public double calculateArea() {
        return (sideOne * sideTwo);
    }

    @Override
    public double calculatePerimeter() {
        return (2 * (sideOne + sideTwo));
    }
}
