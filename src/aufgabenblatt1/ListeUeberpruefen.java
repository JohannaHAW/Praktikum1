package aufgabenblatt1;

public class ListeUeberpruefen {
	public static boolean IstErstesElementEinZahl(ArrayListe<?> liste) {
		if (liste.get(0) instanceof Number) {
			return true;
		}
		return false;

	}
}
