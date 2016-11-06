import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Дмитрий on 03.11.2016.
 */
public class AvailableTypeOfShape {
    enum TypeOfShape {
        CIRCLE, RECTANGLE, SQUARE, TRIANGLE,
    }

    static public TypeOfShape inputShapeType() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("There are few figures, you can choose: ");
        for (TypeOfShape s : TypeOfShape.values())
            System.out.println(s.name());

        TypeOfShape type = null;

        boolean validShape = false;

        while (!validShape) {

            System.out.println("Input type of shape:");
            String shapeName = reader.readLine();
            for (TypeOfShape s : TypeOfShape.values()) {
                if (shapeName.toUpperCase().equals(s.toString())) {
                    type = s;
                    validShape = true;
                }
            }

        }
        return type;
    }
}
