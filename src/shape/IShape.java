package shape;

import java.io.IOException;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public interface IShape {
    void fetchParameters() throws IOException;

    void printResult();

    double calculateArea();

    double calculatePerimeter();
}
