import shape.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static shape.ShapesTypes.*;


/**
 * Created by Дмитрий on 03.11.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("There are few figures, you can choose: ");
        for (ShapesTypes s : getAvailableTypes()) {
            System.out.println(s.name());
        }

        ShapesTypes type;

        do {
            System.out.println("Input type of shape:");
            String shapeName = reader.readLine();
            type = getType(shapeName);
        } while (type == NONE);

        IShape shape = createShape(type);

        assert shape != null;
        shape.fetchParameters();
        shape.printResult();
    }

    private static IShape createShape(ShapesTypes type) throws IOException {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}