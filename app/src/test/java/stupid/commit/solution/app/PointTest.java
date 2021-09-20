package stupid.commit.solution.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    @DisplayName("define a point by given x and why value")
    void instanciatePointWithXY() {
        Point point = new Point(1, 2);
        Assertions.assertEquals(1, point.getX());
        Assertions.assertEquals(2, point.getY());
    }
}
