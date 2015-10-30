package aufgabenblatt1;

/**
 * Praktikum 1, Aufgabe 4
 * 
 * @author Thi Huyen, Cao(Lilli) email: ThiHuyen.Cao@haw-hamburg.de Johanna Ahlf
 *         email: johanna.ahlf@haw-hamburg.de Technische Informatik, HAW Prof.
 *         Philipp Jenke
 */
public class ListeUeberpruefen {
	public static boolean istErstesElementEinZahl(ArrayListe<?> liste) {
		if (liste.get(0) instanceof Number) {
			return true;
		}
		return false;

	}
}
