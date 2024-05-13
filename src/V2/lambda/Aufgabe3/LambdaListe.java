package V2.lambda.Aufgabe3;

import java.util.Arrays;
import java.util.List;
public class LambdaListe {
	public static void main(String[] args) {
		// Erzeuge eine Liste mit Zahlen vom Typ Integer
		List<Integer> liste = Arrays.asList(11, 21, 24, 36, 41, 55, 62, 66);
		// Hier folgt Ihr eigener Code
		/*
		 * Gib die Listenelemente durch Leerzeichen getrennt in einer Zeile auf
		 * der Konsole aus.  Sortiere die Liste nach dem Rest der Division des
		 * Elements durch 8.  Gib die neu sortierte Liste durch Leerzeichen
		 * getrennt in einer Zeile auf der Konsole aus.
		 */
		liste.forEach(i -> System.out.print(i + ","));
		System.out.println();
		liste.sort((a, b) -> a % 8 - b % 8);
		liste.forEach(i -> System.out.print(i + " "));

	}
}