package pwo.lab;

public class Text {
    static boolean cont5Dig(String str) {
        return str.replaceAll("[^0-9]", "").length() == 5;
    }

    static int howManyDigits(String str) {
        return str.replaceAll("[^0-9]", "").length();
    }

    static boolean doesntHaveDigits(String str) {
        return str.replaceAll("[^0-9]", "").length() == 0;
    }

    static boolean isOnlyDigits(String str) {
        return str.replaceAll("[^0-9]", "").length() == str.length();
    }
}
