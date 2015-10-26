package aufgabenblatt1;
/**
 * Praktikum 1, Aufgabe 4 : Diese Class verwaltet ein Array Liste von einem generischen Typ
 * @author Thi Huyen, Cao(Lilli) email: ThiHuyen.Cao@haw-hamburg.de
 *         Johanna Ahlf          email: johanna.ahlf@haw-hamburg.de
 * Technische Informatik, HAW
 * Prof. Philipp Jenke
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.lang.model.element.Element;

public class ArrayListe<T extends Comparable<T>> {
	protected int anzahlElemente;
	private Object[] elemente;
	private int erfuelltPlatz = 0;

	/*
	 * Konstruktur
	 */
	public ArrayListe(int anzahlElemente) {
		this.anzahlElemente = anzahlElemente;
		this.elemente = new Object[anzahlElemente];
	}

	/**
	 * Getter
	 */
	public Object[] getElemente() {
		return elemente;
	}

	public int getErfuelltPlatz() {
		return erfuelltPlatz;
	}

	/**
	 * Diese Methode liefert die Länge des Arrays
	 */

	public int getAnzahlElemente() {
		return anzahlElemente;
	}

	/**
	 * Diese Methode fuegt eine t von Typ T in den Array hinzu. Falls der Array
	 * schon voll erfüllt, erhöhnt die Länge des Arrays um 1
	 * 
	 * @param t
	 */

	public void hinzufuegen(T t) {
		if (erfuelltPlatz == anzahlElemente) {
			Object[] elementeVerlaengern = new Object[elemente.length + 1];
			System.arraycopy(elemente, 0, elementeVerlaengern, 0, elemente.length);
			elemente = elementeVerlaengern;
			elemente[elemente.length - 1] = t;
			anzahlElemente++;
			erfuelltPlatz++;
		}
		for (int i = 0; i < elemente.length; i++) {
			if (elemente[i] == null) {
				elemente[i] = t;
				erfuelltPlatz++;
				break;
			}

		}

	}

	/**
	 * Diese Methode gibt das Element bei dem eingegebenen Index zurück. False
	 * den Index ungültig ist, wird IndexOutOfBoundsException geworfen
	 * 
	 * @param index
	 * @return element mit dem eingegebenen Index.
	 */
	public T get(int index) throws IndexOutOfBoundsException {
		if ((index < 0) || (index > anzahlElemente)) {
			throw new IndexOutOfBoundsException();
		}
		return (T) elemente[index];

	}

	/**
	 *
	 * Diese Methode sucht nach einem eingegebenen Element und entfernt es aus
	 * der Liste
	 * 
	 * @param t
	 */
	public void entfernen(T t) {
		for (int i = 0; i < elemente.length; i++) {
			if (elemente[i] == t) {
				elemente[i] = null;
				erfuelltPlatz--;

			}
		}

	}

	/**
	 * Diese Methode entfernte das Element an der eingegebenen Stelle.
	 * 
	 * @param index
	 * @throws IndexOutOfBoundsException
	 */
	public void entferneElementAnindex(int index) throws IndexOutOfBoundsException {
		if ((index < 0) || (index > anzahlElemente)) {
			throw new IndexOutOfBoundsException();
		}
		elemente[index] = null;
		erfuelltPlatz--;

	}

	/**
	 * Diese Methode sucht die kleinsten Number-Element in dem Array
	 */
	public int getKleinstesElement() throws KeinIntegerArrayListeException {
		for (int i = 0; i < elemente.length; i++) {
			if (!(elemente[i] instanceof Integer)) {
				throw new KeinIntegerArrayListeException("Es ist keine ArrayListe von Integer-Werten");
			}
		}
		int kleinstesElement = (int) elemente[0];
		for (int i = 0; i < elemente.length; i++) {
			if ((int) elemente[i] < kleinstesElement) {
				kleinstesElement = (int) elemente[i];
			}
		}
		return kleinstesElement;
	}

	/**
	 * Diese Methode überprüft ob das Array Integer Werten enthält, Wenn ja,
	 * berechnet er die Summe aller Werten. Falls nein wird
	 * KeinIntegerArrayListeException geworfen
	 * 
	 * @return
	 * @throws KeinIntegerArrayListeException
	 */
	public int summeAllerIntergerWerten() throws KeinIntegerArrayListeException {
		int summe = 0;
		for (int i = 0; i < elemente.length; i++) {
			if (!(elemente[i] instanceof Integer)) {
				throw new KeinIntegerArrayListeException("Es ist keine ArrayListe von Integer-Werten");
			} else
				summe = summe + (int) elemente[i];
		}
		return summe;
	}

	/**
	 * Diese Methode sorgt dafür, dass die Elemente von Array sortiert werden
	 * 
	 * @return
	 */
	public void sortieren() {
		for (int i = 0; i < elemente.length; i++) {
			elemente[i] = (T) elemente[i];
		}

		Arrays.sort(elemente);
	}

	/**
	 * Diese Methode liefert die Beschreibung eines Objects vom Typ Arrayliste
	 * <T> (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String beschreibung = "Jetzt kommt die Liste: \n";
		for (int i = 0; i < elemente.length; i++) {
			beschreibung = beschreibung + "Element " + i + " ist: " + elemente[i] + "     ";

		}
		return beschreibung;
	}

}
