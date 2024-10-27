import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab4Tests {

	// Test for Point class

    @Test
    void testDistanceSamePoint() {
        Point p1 = new Point(0, 0);
        assertEquals(0, p1.distance(p1));
    }

    @Test
    void testDistanceDifferentPoints() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        assertEquals(5, p1.distance(p2));
    }

    @Test
    void testEqualsSameObject() {
        Point p1 = new Point(1, 1);
        assertTrue(p1.equals(p1));
    }

    @Test
    void testEqualsDifferentXPoints() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        assertFalse(p1.equals(p2));
    }
    
    @Test
    void testEqualsDifferentYPoints() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 2);
        assertFalse(p1.equals(p2));
    }
    
    @Test
    void testEqualsDifferentClass() {
        Point p1 = new Point(1, 1);
        String notAPoint = "Not a Point";
        assertFalse(p1.equals(notAPoint));
    }

    @Test
    void testEqualsNull() {
        Point p1 = new Point(1, 1);
        assertFalse(p1.equals(null));
    }

    @Test
    void testEqualsSameCoordinates() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);
        assertTrue(p1.equals(p2));
    }

    @Test
    void testHashCode() {
        Point p1 = new Point(1, 1);
        assertEquals(8, p1.hashCode()); // 3*1 + 5*1 = 8
    }

    // Test for Triangle class

    @Test
    void testPerimeter() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0, 4);
        Triangle t = new Triangle(p1, p2, p3);
        assertEquals(12, t.perimeter());
    }

    @Test
    void testIsEquilateralTrue() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(Math.sqrt(5), 0);
        Point p3 = new Point(Math.sqrt(5)/2, Math.sqrt(15)/2);
        Triangle t = new Triangle(p1, p2, p3);
        assertTrue(t.isEquilateral());
    }

    @Test
    void testIsEquilateralFalse() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0, 4);
        Triangle t = new Triangle(p1, p2, p3);
        assertFalse(t.isEquilateral());
    }

    @Test
    void testIsEquilateralFirstFalse() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(2, Math.sqrt(12));
        Triangle t = new Triangle(p1, p2, p3);
        assertFalse(t.isEquilateral());
    }

    @Test
    void testIsEquilateralSecondFalse() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        Point p3 = new Point(2, 2);
        Triangle t = new Triangle(p1, p2, p3);
        assertFalse(t.isEquilateral());
    }

}
