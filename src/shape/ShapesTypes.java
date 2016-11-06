package shape;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public enum ShapesTypes {
    CIRCLE, RECTANGLE, SQUARE, TRIANGLE, NONE;

    public static List<ShapesTypes> getAvailableTypes() {
        return Arrays.asList(CIRCLE, RECTANGLE, SQUARE, TRIANGLE);
    }

    public static ShapesTypes getType(String type) {
        if (type == null || type.isEmpty()) {
            return NONE;
        }

        for (ShapesTypes shapesType : getAvailableTypes()) {
            if (shapesType.name().equals(type.toUpperCase())) {
                return shapesType;
            }
        }

        return NONE;
    }
}
