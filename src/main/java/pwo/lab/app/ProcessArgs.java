package pwo.lab.app;

import java.util.ArrayList;

import pwo.lab.Text;
import pwo.lab.app.ProcessData.Action;

public class ProcessArgs {
    /*
     * Wyszukuje w tablicy stringów pozycję, która może być
     * zinterpretowana jako wartość typu ProcessData.Action.
     * Wielkość czcionki nie ma znaczenia. Obowiązuje
     * pierwsze dopasowanie. Jeżeli nie znajdzie to zwraca
     * wartość UNDEFINE.
     */
    public static Action getAction(String[] args) {
        for (String string : args) {
            if (string.toUpperCase().equals("SUM")) {
                return Action.SUM;
            }
            if (string.toUpperCase().equals("MAX")) {
                return Action.MAX;
            }
        }
        return Action.UNDEFINE;
    }

    /*
     * Wyszukuje w tablicy stringów pozycje, które mogą być
     * zinterpretowane jako liczby. Tworzy z tych liczb
     * tablicę. Jeżeli nie ma liczb to zwraca pustą tablicę.
     */
    public static double[] getNumbers(String[] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        for (String string : args) {
            if (string.replaceAll("[^0-9,-]", "").length() == string.length()) {
                numbers.add(Double.parseDouble(string));
            }
        }

        double[] toReturn = new double[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            toReturn[i] = numbers.get(i); 
        }

        return toReturn;
    }
}
