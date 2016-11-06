import TypeOfShape.Circle;
import TypeOfShape.Rectangle;
import TypeOfShape.Square;
import TypeOfShape.Triangle;
import java.io.IOException;


/**
 * Created by Дмитрий on 03.11.2016.
 */
public class Main {


    public static void main(String[] args) throws IOException {

        switch (AvailableTypeOfShape.inputShapeType()) {
            case CIRCLE:
                new Circle();
                break;
            case TRIANGLE:
                new Triangle();
                break;
            case RECTANGLE:
                new Rectangle();
                break;
            case SQUARE:
                new Square();
                break;

        }
    }
}