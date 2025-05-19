import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void add() {
        int sum = Main.add(2, 3);

        assertEquals(5, sum);
    }

    @Test
    void sub() {
        int res = Main.sub(3, 1);

        assertEquals(2, res);
    }
}