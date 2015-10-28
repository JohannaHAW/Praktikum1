package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testListeUeberpruefen {

	@Test
	public void testIstErstesElementEinZahl() {
		ListeUeberpruefen test = new ListeUeberpruefen();
		ArrayListe<Integer> list1 = new ArrayListe<Integer>(3);
		list1.hinzufuegen(3);
		ArrayListe<String> list2 = new ArrayListe<String>(3);
		list2.hinzufuegen("first");
		assertEquals(true, test.istErstesElementEinZahl(list1));
		assertEquals(false, test.istErstesElementEinZahl(list2));
	}

}
