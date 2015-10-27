package aufgabenblatt1;
/**
 * Praktikum 1, Aufgabe 4 Exception für den Fall, dass das Array keine Integer Werten enthält.
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
