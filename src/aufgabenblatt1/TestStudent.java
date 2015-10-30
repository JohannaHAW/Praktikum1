package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudent {

	@Test
	public void testGetter() {
		Student student = new Student("Lilli", "Cao", 224555);
		// Test getVorName (Große-Kleine Buchstaben werden berückrigt)
		assertEquals("Lilli", student.getVorname());
		assertFalse("lilli" == student.getVorname());
		// Test getNachname (Große-Kleine Buchstaben werden berückrigt)
		assertEquals("Cao", student.getNachname());
		assertFalse("cao" == student.getNachname());
		// Test getMartikelnummer
		assertEquals(224555, student.getMatrikelnummer());
		assertFalse(2245555.0 == student.getMatrikelnummer());
	}

	@Test
	public void testCompareTo() {
		
		Student student1 = new Student("Lilli", "Cao", 224555);
		Student student2 = new Student("Robert", "Mueller", 224556);
		Student student3 = new Student("Robert", "Klein", 224555);

		assertEquals(-1, student1.compareTo(student2));
		
		//Test mit den Studenten, die gleiche Martikelnummer aber unterschiedliche Namen haben
		assertEquals(0, student1.compareTo(student3));
		
		assertEquals(1, student2.compareTo(student1));

	}
}
