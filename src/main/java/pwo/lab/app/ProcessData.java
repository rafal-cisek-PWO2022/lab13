package pwo.lab.app;

public class ProcessData {
    public enum Action {
        UNDEFINE, SUM, MAX
    }

    public Double process(Action action, double[] numbers) {
        switch (action) {
            case SUM:
                return sum(numbers);
            case MAX:
                return max(numbers);
            default:
                return null;
        }
    }

    /*
     * Sumuje liczby przekazane jako tablica i zwraca wynik.
     * Jeżeli tablica jest pusta, to zwraca null.
     */
    private Double sum(double[] numbers) {
        if (numbers.length == 0) {
            return null;
        }

        double sum = 0;
        for (double d : numbers) {
            sum += d;
        }
        return sum;
    }

    /*
     * Przeszukuje przekazaną tablicę liczb i zwraca
     * maksymalną. Jeżeli tablica jest pusta, to zwraca null.
     */
    private Double max(double[] numbers) {
        if (numbers.length == 0) {
            return null;
        }

        double max = numbers[1];
        for (double d : numbers) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }
}
