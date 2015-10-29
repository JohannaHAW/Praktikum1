package aufgabenblatt2;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class stream_pro {
	// public boolean istKeinNull(String element) {
	// if (element == null) {
	// return true;
	// }
	// return false;
	// }
	public String verkuerzenAuf8(String text) {
		if (text.length() <= 8) {
			return text;
		}
		stringArbeiten erg = origin -> origin.substring(0, 7);
		return erg.stringArbeiten(text);

	}

	Predicate<String> keinNull = text -> !text.equals(null);

	public List<String> streamWork(String array[]) {
		return Arrays.stream(array).filter(keinNull).forEach(
			 (text)-> {return text.toUpperCase().replace(Ä, AE).replace(Ö, OE).replace(Ü, UE).replace(ß, SS).trim.verkuerzenauf8.collection()});

	}
public static void main(String[] args){
	
stream_pro test = new stream_pro();
}
