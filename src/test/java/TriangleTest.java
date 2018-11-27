import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    void testEquilateral() {
        TriangleType type = Triangle.classify(3, 3, 3);
        assertEquals(TriangleType.EQUILATERAL, type);
    }

    @Test
    void testIsosceles() {
        TriangleType type = Triangle.classify(5, 5, 3);
        assertEquals(TriangleType.ISOSCELES, type);
    }

    @Test
    void testScalene() {
        TriangleType type = Triangle.classify(3, 4, 5);
        assertEquals(TriangleType.SCALENE, type);
    }

    @Test
    void testInvalidAddedTwoSidesEqualsAnother() {
        TriangleType type = Triangle.classify(1, 1, 2);
        assertEquals(TriangleType.INVALID, type);
    }
}
