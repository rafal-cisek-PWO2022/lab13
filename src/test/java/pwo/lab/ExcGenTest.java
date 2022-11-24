package pwo.lab;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExcGenTest {
    @Test
    public void testgenExc1() {
        System.out.println("Test: IllegalStateException");
        ExcGen excGen = new ExcGen();
        Exception exception = assertThrows(IllegalStateException.class, () -> excGen.gen(0));
        assertTrue(exception.getMessage()
                .contains(ExcGen.MESSAGE_1));
    }

    @Test
    public void testgenExc2() {
        System.out.println("Test: IllegalStateException");
        ExcGen excGen = new ExcGen();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> excGen.gen(1));
        assertTrue(exception.getMessage()
                .contains(ExcGen.MESSAGE_2));
    }

    @Test
    public void testgenExc3() {
        System.out.println("Test: IllegalStateException");
        ExcGen excGen = new ExcGen();
        Exception exception = assertThrows(NullPointerException.class, () -> excGen.gen(2));
        assertTrue(exception.getMessage()
                .contains(ExcGen.MESSAGE_3));
    }
}
