package aufgabenblatt1;



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
			erfuelltPlatz ++;
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
	 * Diese Methode gibt die Element bei dem eingegebenen Index zurück
	 * 
	 * @param index
	 * @return element mit dem eingegebenen Index.
	 */
	public T get(int index) throws IndexOutOfBoundsException {

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
		elemente[index] = null;
		erfuelltPlatz--;

	}

	/**
	 * Diese Methode liefert die Länge des Arrays
	 */

	public int getAnzahlElemente() {
		return anzahlElemente;
	}

	/**
	 * Diese Methode liefert die Beschreibung eines Objects vom Typ Arrayliste
	 * <T> (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String beschreibung = "********************************************************\n";
		for (int i = 0; i < elemente.length; i++) {
			beschreibung = beschreibung + "Element " + i + " ist: " + elemente[i] + "     ";

		}
		beschreibung = beschreibung + "\n***************************************************\n";
		return beschreibung;
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
 * @return
 */
	public void sortieren(){
		for(int i=0; i<elemente.length; i++){
			elemente[i] =(T)elemente[i];
		}
		
		Arrays.sort(elemente);
	}

	public static void main(String args[]) {

		ArrayListe<Double> list1 = new ArrayListe(3);

		list1.hinzufuegen(0.0);
		list1.hinzufuegen(9.0);
		list1.hinzufuegen(2.0);
		list1.hinzufuegen(18.0);
		System.out.println(list1.toString());
	System.out.println(list1.elemente.length);
	list1.entferneElementAnindex(2);
	System.out.println(list1.toString());
	list1.hinzufuegen(7.0);
	System.out.println(list1.toString());
	list1.entfernen(6.0);
	System.out.println(list1.toString());
		try {
			System.out.println(list1.getKleinstesElement());
		} catch (KeinIntegerArrayListeException e) {
			System.out.println("kein Integer Liste");
		}
	list1.sortieren();
    System.out.println(list1.toString());

	}
}
