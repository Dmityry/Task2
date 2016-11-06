package TypeOfShape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Дмитрий on 03.11.2016.
 */
public class Triangle implements IShape {
    double a, b, c;

    public Triangle() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter side of triangle a, b and c: ");
        String sideA = reader.readLine();
        String sideB = reader.readLine();
        String sideC = reader.readLine();
        a = Double.parseDouble(sideA);
        b = Double.parseDouble(sideB);
        c = Double.parseDouble(sideC);
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
