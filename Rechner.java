import java.util.Scanner;
import java.util.function.*;

/**
 * Ein Taschenrechner
 * 
 * @author Malte Nagel, Prof. Dr.-Ing. Emre Cakar
 */
public class Rechner
{
    /*
     * Die main-Methode. Gibt "Hallo Welt!" aus.
     */
    public static void main(String[] args)
    {
        // Einrichtung
        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        BiFunction<Double, Double, Double> sub = (a, b) -> a - b;
        BiFunction<Double, Double, Double> mult = (a, b) -> a * b;
        BiFunction<Double, Double, Double> divi = (a, b) -> a / b;
        double a, b = 0;
        String op;
        JConsole console = new JConsole();
        
        while (true) {
            // Eingabe
            do {
                op = console.readString("Welche Operation soll durchgeführt werden (+,-,*,/)?: ");
            } while(!op.equals("+") && !op.equals("-"));
            
            a = console.readInt("Erste Ganzzahl: ");
            b = console.readInt("Zweite Ganzzahl: ");
            
            // Verarbeitung
            if (op.equals("+")) {
                console.println("Ergebnis: " + add.apply(a, b));
            } else if (op.equals("-")) {
                console.println("Ergebnis: " + sub.apply(a, b));
            } else if (op.equals("*")) {
                console.println("Ergebnis: " + mult.apply(a, b));
            } else if (op.equals("/")) {
                console.println("Ergebnis: " + divi.apply(a, b));
            }
        }
    }
}
