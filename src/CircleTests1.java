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
	
}
