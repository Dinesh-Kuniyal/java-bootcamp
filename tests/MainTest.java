import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void add() {
        int sum = Main.add(2, 3);

        assertEquals(5, sum);
    }
}