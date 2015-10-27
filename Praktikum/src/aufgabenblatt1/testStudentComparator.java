package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testStudentComparator {

	@Test
	public void testCompare() {
		StudentComparator test = new StudentComparator();
		Student student1 = new Student("Huyen", "Cao", 23);
		Student student2 = new Student("Andre", "Meyer", 22);
		Student student3 = new Student("Andre", "Alian", 45);
		Student student4 = new Student("Andre", "Alian", 34);
		Student student5 = new Student("Huyen", "Alian", 56);
		
		//Test: 2 Studenten mit unterschiedlichen Nachnamen
		assertEquals(-1,test.compare(student1, student2));
		//Test: 2 Studenten mit gleichen Nachnamen, unterschiedlichen Vorname
		assertEquals(-1,test.compare(student4, student5));
		// Test: 2 Studenten mit gleichen Nachnamen, Vornamen aber unterschiedlichen Martikelnummer
		assertEquals(0, test.compare(student3, student4));
	}

}
