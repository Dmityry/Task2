package shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Circle implements IShape {

    private double radius;

    @Override
    public void fetchParameters() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius of circle: ");
        radius = Double.parseDouble(reader.readLine());
    }

    @Override
    public void printResult() {
        System.out.println("Area of circle = " + calculateArea());
        System.out.println("Perimeter of circle = " + calculatePerimeter());
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }
}

