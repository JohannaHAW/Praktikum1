package aufgabenblatt1;
/**
 * Praktikum 1, Aufgabe 2 
 * @author Thi Huyen, Cao(Lilli) email: ThiHuyen.Cao@haw-hamburg.de
 *         Johanna Ahlf          email: johanna.ahlf@haw-hamburg.de
 * Technische Informatik, HAW
 * Prof. Philipp Jenke
 */
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getNachname().compareTo(student2.getNachname()) > 0) {
			return 1;

		} else if (student1.getNachname().compareTo(student2.getNachname()) < 0) {
			return -1;
		} else if (student1.getNachname().compareTo(student2.getNachname()) == 0) {
			if (student1.getVorname().compareTo(student2.getVorname()) > 0) {
				return 1;
			} else if (student1.getVorname().compareTo(student2.getVorname()) < 0) {
				return -1;

			}
		}
		return 0;
	}

}
