package pwo.lab;

public class Number {
    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static boolean isEven(int i) {
        return !isOdd(i);
    }
}
