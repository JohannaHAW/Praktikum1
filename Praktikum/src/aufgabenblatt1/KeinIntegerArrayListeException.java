package aufgabenblatt1;
/**
 * Praktikum 1, Aufgabe 4 Exception f�r den Fall, dass das Array keine Integer Werten enth�lt.
 * @author Thi Huyen, Cao(Lilli) email: ThiHuyen.Cao@haw-hamburg.de
 *         Johanna Ahlf          email: johanna.ahlf@haw-hamburg.de
 * Technische Informatik, HAW
 * Prof. Philipp Jenke
 */
public class KeinIntegerArrayListeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4192219838202054583L;

public KeinIntegerArrayListeException(String message){
	super("Kein Integer List");
}


}
