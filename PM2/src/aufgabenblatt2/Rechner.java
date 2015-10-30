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
	 * Diese Methode initialisiert ein Map mit Schlüssel von Typ enum und Wert
	 * von Typ BinaryOperator
	 *
	 */
	public Map<Operation, BinaryOperator<Double>> mapIni() {
		Map<Operation, BinaryOperator<Double>> map = new HashMap<Operation, BinaryOperator<Double>>();
		map.put(Operation.ADDITION, (wert1, wert2) -> {
			return wert1 + wert2;
		});
		map.put(Operation.SUBTRACTION, (wert1, wert2) -> {
			return wert1 - wert2;
		});
		map.put(Operation.MULTIPLICATION, (wert1, wert2) -> {
			return wert1 * wert2;
		});
		map.put(Operation.DEVISION, (wert1, wert2) -> {
			return wert1 / wert2;
		});
		return map;
	}

	/**
	 * Diese Methode wert 2 Zahl mit der eingegebenen Operation aus und liefert
	 * das Ergebnis zurück
	 * 
	 * @param operation
	 * @param zahl1
	 * @param zahl2
	 * @return
	 * @throws NullPointerException
	 */

	public double berechne(Operation operation, double zahl1, double zahl2) throws NullPointerException {
		if (zahl2 == 0 && operation == Operation.DEVISION) {
			throw new NullPointerException("Devision by 0");
		}
		return this.mapIni().get(operation).apply(zahl1, zahl2);
	}

}
