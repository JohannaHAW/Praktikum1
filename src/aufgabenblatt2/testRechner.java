package aufgabenblatt2;
/**
 * Praktikum 2, Aufgabe 1
 * @author Thi Huyen, Cao(Lilli) email: ThiHuyen.Cao@haw-hamburg.de
 *         Johanna Ahlf          email: johanna.ahlf@haw-hamburg.de
 * Technische Informatik, HAW
 * Prof. Philipp Jenke
 */
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import aufgabenblatt2.Rechner.Operation;

public class testRechner {

	@Test
	public void testBerechne() {
		Rechner test = new Rechner();
		// Test Addition
		assertEquals(22.3, test.berechne(Operation.ADDITION, 10.1, 12.2), 10e-5);
		// Test Subtraction
		assertEquals(12.20, test.berechne(Operation.SUBTRACTION, 24.4, 12.2), 10e-5);
		// Test Multiplication
		assertEquals(20.2, test.berechne(Operation.MULTIPLICATION, 10.1, 2), 10e-5);
		// Test Division
		assertEquals(5.25, test.berechne(Operation.DEVISION, 10.5, 2.0), 10e-5);
		// Test Devision mit NullpointeException
		try {
			test.berechne(Operation.DEVISION, 15.75, 0.0);
			Assert.assertTrue("Es wurde keine Exception geworfen", false);

		} catch (NullPointerException e) {
			e.getMessage();
		}
	}

}
