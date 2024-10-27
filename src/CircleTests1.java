import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Circle;

class CircleTests1 {

	@Test
	void testConstructorRadius() {
		Circle circle = new Circle(1, new Point(0, 0));
		assertEquals(circle.radius, 1);
	}
	
	@Test
	void testConstructorPoint() {
		Circle circle = new Circle(1, new Point(0, 0));
		assertEquals(circle.center, new Point(0, 0));
	}
	
	@Test
	void testArea() {
		Circle circle = new Circle(1, new Point(0, 0));
		assertEquals(circle.area(), Math.PI);
	}
	
	@Test
	void testEqualsReflexitivity() {
		Circle circle = new Circle(1, new Point(0, 0));
		assertTrue(circle.equals(circle));
	}
	

	@Test
	void testEqualsNull() {
		Circle circle = new Circle(1, new Point(0, 0));
		assertFalse(circle.equals(null));
	}
	
	@Test
	void testEqualsClass() {
		Circle circle = new Circle(1, new Point(0, 0));
		assertFalse(circle.equals(new Point(1, 1)));
	}
	
	@Test
	void testEqualsFail() {
		Circle circle = new Circle(1, new Point(0, 0));
		assertFalse(circle.equals(new Circle(1, new Point(1, 1))));
	}
	
	@Test
	void testEqualsPass() {
		Circle circle = new Circle(1, new Point(0, 0));
		assertTrue(circle.equals(new Circle(1, new Point(0, 0))));
	}

	// ----
	@Test
	void testBasicCircleCircumference(){
		Point p1 = new Point(1,2);
		Circle c = new Circle(3, p1);
		assertEquals(c.circumference(),2*Math.PI * c.radius);
	}

	@Test
	void testCircumferenceZeroRadius() {
        Circle circle = new Circle(0.0, new Point(0.0, 0.0));
        double exp = 0.0;
        assertEquals(exp, circle.circumference());
    }

	@Test
	void testHashCodeEqualityWithEqualCircles() {
        Point center1 = new Point(3.0, 4.0);
        Circle circle1 = new Circle(7.0, center1);
        Circle circle2 = new Circle(7.0, new Point(3.0, 4.0));
        assertEquals(circle1.hashCode(), circle2.hashCode());
    }
	
	@Test
	void testHashCodeEquals() {
		Point p3 = new Point(1,2);
		Circle c = new Circle(2, p3);
		Point p4 = new Point(1,2);
		Circle c1 = new Circle(2, p4);
		assertTrue(c.hashCode() == c1.hashCode());
	}
	
	@Test
	void testHashCodeNotEquals() {
		Point p3 = new Point(1,2);
		Circle c = new Circle(2, p3);
		Point p4 = new Point(2,2);
		Circle c1 = new Circle(3, p4);
		assertFalse(c.hashCode() == c1.hashCode());
	}
	
}
