package pwo.lab;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TextTest {
    @ParameterizedTest
    @ValueSource(strings = { "aa234bb34sd", "1 2 3 4 5",
            "xx12x12x1x" })
    void cont5DigTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "aa23bb34sd", "1 2 x 4 5",
            "xx1x12x1x" })
    void cont5DigTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "aa23bb34sd", "1 2 x 4 5",
            "xx1x12x1x" })
    void howManyDigitsTest1(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertTrue(Text.howManyDigits(str) == 4);
    }

    @ParameterizedTest
    @ValueSource(strings = { "aa234bb34sd", "1 2 3 4 5",
            "xx12x12x1x" })
    void howManyDigitsTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.howManyDigits(str) == 4);
    }

    @ParameterizedTest
    @ValueSource(strings = { "123ab", "456cd", "789ef" })
    void doesntHaveDigitsTest1(String str) {
        assertFalse(Text.doesntHaveDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "ab", "cd", "ef" })
    void doesntHaveDigitsTest2(String str) {
        assertTrue(Text.doesntHaveDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "123", "456", "789" })
    void isOnlyDigitsTest1(String str) {
        assertTrue(Text.isOnlyDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "123ab", "456cd", "789ef" })
    void isOnlyDigitsTest2(String str) {
        assertFalse(Text.isOnlyDigits(str));
    }
}
