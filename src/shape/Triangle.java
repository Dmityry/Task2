package shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Дмитрий on 03.11.2016.
 */
public class Triangle implements IShape {

    private double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public void fetchParameters() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter side of triangle a, b and c: ");
        a = Double.parseDouble(reader.readLine());
        b = Double.parseDouble(reader.readLine());
        c = Double.parseDouble(reader.readLine());
    }

    @Override
    public void printResult() {
        System.out.println("Area of triangle = " + calculateArea());
        System.out.println("Perimeter of triangle = " + calculatePerimeter());
    }

    @Override
    public double calculateArea() {
        double p;
        p = (a + b + c) / 2;

        return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    @Override
    public double calculatePerimeter() {
        return (a + b + c);
    }


}
