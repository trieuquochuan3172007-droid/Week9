package auction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    void testAdd() {
        MathUtils utils = new MathUtils();
        // Kiểm tra xem 2 + 3 có bằng 5 không
        assertEquals(5, utils.add(2, 3));
    }
}