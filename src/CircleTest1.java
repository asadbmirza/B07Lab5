package B07Lab5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CircleTest {
// ------- Circumference tests below ------ //

	@Test
	void testBasicCircleCircumference(){
		Point p1 = new Point(1,2);
		Circle c = new Circle(3, p1);
		assertEquals(c.circumference(),2*Math.PI * c.radius);
	}

	@Test
	public void testCircumferenceZeroRadius() {
        Circle circle = new Circle(0.0, new Point(0.0, 0.0));
        double exp = 0.0;
        assertEquals(exp, circle.circumference());
    }
	
// ------- HashCode tests below ------ //
	@Test
	public void testHashCodeEqualityWithEqualCircles() {
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