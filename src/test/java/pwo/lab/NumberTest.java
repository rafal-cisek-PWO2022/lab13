package pwo.lab;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberTest {

    @ParameterizedTest
    @ValueSource(ints = { 1, 3, 5, 7, 15, 101 })
    void isOddTest(int number) {

        System.out.println("Nieparzystość: " + number);

        assertTrue(Number.isOdd(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { 22, 304, 56, 312, 998, 1024 })
    void isEvenTest(int number) {

        System.out.println("Parzystość: " + number);

        assertTrue(Number.isEven(number));
    }


}
