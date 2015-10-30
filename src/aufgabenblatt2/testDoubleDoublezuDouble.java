package aufgabenblatt2;
/**
 * Praktikum 2, Aufgabe 1
 * @author Thi Huyen, Cao(Lilli) email: ThiHuyen.Cao@haw-hamburg.de
 *         Johanna Ahlf          email: johanna.ahlf@haw-hamburg.de
 * Technische Informatik, HAW
 * Prof. Philipp Jenke
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class testDoubleDoublezuDouble {

	@Test
	public void testWerteaus() {
		DoubleDoubleZuDouble test1 = (wert1, wert2) -> {return wert1*wert2;};
		assertEquals (10, test1.werteAus(2,5), 10e-5);
		DoubleDoubleZuDouble test2 = (wert1, wert2) -> {return wert1/wert2;};
		assertEquals (10, test2.werteAus(100,10), 10e-5);
		

	}

}
