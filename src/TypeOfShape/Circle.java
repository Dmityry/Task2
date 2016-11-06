package TypeOfShape; /**
 * Created by Дмитрий on 02.11.2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;
import static java.lang.System.out;


public class Circle  implements IShape  {
    double radius;
    public Circle() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius of circle: ");
        String inputRadius = reader.readLine();
        radius = Double.parseDouble(inputRadius);
        System.out.println("Area of circle = " + calculateArea());
        System.out.println("Perimeter of circle = " + calculatePerimeter());
      //  this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return (Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter(){
        return  (2*Math.PI*radius);
    }



}

