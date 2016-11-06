package shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Дмитрий on 03.11.2016.
 */
public class Square implements IShape {

    private double side;

    @Override
    public void fetchParameters() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter one side of square: ");
        side = Double.parseDouble(reader.readLine());
    }

    @Override
    public void printResult() {
        System.out.println("Area of square = " + calculateArea());
        System.out.println("Perimeter of square = " + calculatePerimeter());

        Triangle triangle = new Triangle(side, side);
        triangle.printResult();
    }

    @Override
    public double calculateArea() {
        return (Math.pow(side, 2));
    }

    @Override
    public double calculatePerimeter() {
        return (4 * side);
    }
}