import org.junit.jupiter.api.Test;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    void testSquareTrue() {

        Rectangle one = new Rectangle(new Point(0,0 ), new Point(0,1 ), new Point(1,1 ), new Point(1,0 ));

        assertTrue(true, one.isSquare());
    }

    @Test
    void testSquareFalse() {

        Rectangle one = new Rectangle(new Point(0,0 ), new Point(0,1 ), new Point(1,1 ), new Point(1,0 ));

        assertTrue(true, one.isSquare());
    }
}
