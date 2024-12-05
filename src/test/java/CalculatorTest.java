import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(4, calculator.add(3, 1));
    }

    @Test
    void dif() {
        assertEquals(2, calculator.dif(6, 4));
    }

    @Test
    void div() {
        assertEquals(4, calculator.div(8, 2));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(3, 2));
    }

    @Test
    void solver() {
        assertEquals(24, calculator.solver());
    }
}