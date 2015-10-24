package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestArrayListe {
	/**
	 * Diese methode initialisiert eine ArrayListe von 2 Integer den Werten 1
	 * und 2
	 * 
	 * @return ein ArrayList<Integer> mit einem Array (Länge 2), die 2 Elemente
	 *         1 und 2 enthält
	 */
	private ArrayListe<Integer> initialisiere() {
		ArrayListe<Integer> list1 = new ArrayListe<Integer>(2);
		list1.hinzufuegen(1);
		list1.hinzufuegen(2);
		return list1;
	}

	@Test
	public void testGetter() {
		initialisiere();
		// test getAnzahlElemente
		assertEquals(2, initialisiere().getAnzahlElemente());
		// test getErfuelltPlatz
		assertEquals(2, initialisiere().getErfuelltPlatz());
		// test getElemente

	}

	@Test
	public void testHinzufuegen() {
		ArrayListe<Integer> list1 = new ArrayListe<Integer>(2);
		ArrayListe<String> list2 = new ArrayListe<String>(2);
		// Test wenn Das Array noch frei Plätze hat
		list1.hinzufuegen(1);
		assertEquals(1, list1.getElemente()[0]);

		list1.hinzufuegen(2);
		assertEquals(2, list1.getElemente()[1]);

		list2.hinzufuegen("first");
		assertEquals("first", list2.getElemente()[0]);

		list2.hinzufuegen("second");
		assertEquals("second", list2.getElemente()[1]);

		// Test wenn Das orginale Array keine freie Plätze mehr hat
		list1.hinzufuegen(3);
		assertEquals(3, list1.getElemente()[2]);

		list2.hinzufuegen("third");
		assertEquals("third", list2.getElemente()[2]);

	}

	@Test
	public void testGet() {

		// Test in Bereich von 0 bis gröste Index
		assertEquals(1, initialisiere().get(0).intValue());
		assertEquals(1, initialisiere().get(0).intValue());

		// Test in dem Bereich wo IndexOutOfBoundException auftaucht
		try {
			initialisiere().get(3);
			Assert.assertTrue("Fehler: Es wurde keine Exception geworfen!", false);

		} catch (IndexOutOfBoundsException e) {

		}

	}

	@Test
	public void testEntfernen() {
		ArrayListe<Integer> list = initialisiere();
		list.entfernen(1);
		assertEquals(null, list.get(0));
	}

	@Test
	public void testEntferneElementAnindex() {
		// Test in Bereich von 0 bis gröste Index
		ArrayListe<Integer> list = initialisiere();
		list.entferneElementAnindex(0);
		assertEquals(null, list.get(0));
		// Test in dem Bereich wo IndexOutOfBoundException auftaucht
		try {
			initialisiere().entferneElementAnindex(3);
			Assert.assertTrue("Fehler: Es wurde keine Exception geworfen!", false);

		} catch (IndexOutOfBoundsException e) {

		}

	}

	@Test
	public void testGetKleinstesElement() {
		// Test mit Array von Integer Werten
		// Test fall KeinIntegerArrayListeException geworfen wird
		try {
			assertEquals(1, initialisiere().getKleinstesElement());
		} catch (KeinIntegerArrayListeException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
		}

	}

	@Test
	public void testSummeAllerIntergerWerten() {
		// Test mit Array von Integer Werten
		// Test fall KeinIntegerArrayListeException geworfen wird
		try {
			assertEquals(3, initialisiere().summeAllerIntergerWerten());
		} catch (KeinIntegerArrayListeException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
		}

	}

	@Test
	public void testSortieren() {
		ArrayListe<Integer> list1 = new ArrayListe<Integer>(2);
		list1.hinzufuegen(2);
		list1.hinzufuegen(1);
		list1.sortieren();
		assertEquals(1, list1.get(0).intValue());
		assertEquals(2, list1.get(1).intValue());
	}

	@Test
	public void testToString() {
		String beschreibung = "Jetzt kommt die Liste: \n" + "Element 0 ist: 1     " + "Element 1 ist: 2     ";
		assertEquals(beschreibung, initialisiere().toString());
	}

}
