package aufgabenblatt2;

/**
 * Praktikum 2, Aufgabe 1 : Diese Class verwaltet 4 Operationen in 
 * einem Map(Schlüssel vom Typ enum und Wert von Typ BinaryOperaotr)
 * @author Thi Huyen, Cao(Lilli) email: ThiHuyen.Cao@haw-hamburg.de
 *         Johanna Ahlf          email: johanna.ahlf@haw-hamburg.de
 * Technische Informatik, HAW
 * Prof. Philipp Jenke
 */
import java.util.*;
import java.util.function.BinaryOperator;

public class Rechner {
	/**
	 * Typ enum Operation enthält 4 Konstant für 4 Operationen
	 * 
	 *
	 */
	public enum Operation {
		ADDITION, SUBTRACTION, MULTIPLICATION, DEVISION
	}

	/**
	 * Die Variable Map mit dem Schlüssel vom Typ enum und dem Wert von Typ
	 * BinaryOperator
	 */
	private Map<Operation, BinaryOperator<Double>> map = new HashMap<Operation, BinaryOperator<Double>>();

	/**
	 * Diese Methode berechnet von 2 eingegebenen Werten mit dem eingegebenen
	 * Operation aus und gibt das Ergebnis zurück. Fall Bei Devision die Nenner
	 * =0, wird NullpointerException geworfen.
	 * 
	 * @param operation
	 * @param x
	 * @param y
	 * @return
	 * @throws IllegalArgumentException
	 * @throws NullPointerException
	 */
	public double berechne(Operation operation, double x, double y)
			throws IllegalArgumentException, NullPointerException {
		switch (operation) {
		case ADDITION:
			DoubleDoubleZuDouble add = (wert1, wert2) -> {
				return wert1 + wert2;
			};
			return add.werteAus(x, y);

		case SUBTRACTION:
			DoubleDoubleZuDouble sub = (wert1, wert2) -> {
				return wert1 - wert2;
			};
			return sub.werteAus(x, y);
		case MULTIPLICATION:
			DoubleDoubleZuDouble mul = (wert1, wert2) -> {
				return wert1 * wert2;
			};
			return mul.werteAus(x, y);
		case DEVISION:
			DoubleDoubleZuDouble dev = (wert1, wert2) -> {
				if (wert2 == 0) {
					throw new NullPointerException();
				}
				return wert1 / wert2;
			};
			return dev.werteAus(x, y);
		default:
			throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
		Rechner test1 = new Rechner();
		System.out.println(test1.berechne(Operation.ADDITION, 23, 17));
		System.out.println(test1.berechne(Operation.SUBTRACTION, 23, 17));
		System.out.println(test1.berechne(Operation.MULTIPLICATION, 24, 17));
		System.out.println(test1.berechne(Operation.DEVISION, 23, 17));
	}
}
