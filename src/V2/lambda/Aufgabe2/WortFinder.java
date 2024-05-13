package V2.lambda.Aufgabe2;

public class WortFinder {
	public static String erstesWort(String[] str, Bedingung bedingung) {
		for (int x = 0; x < str.length; x++) {
			if (bedingung.trifftZuAuf(str[x]) == true) {
				return str[x];
			}
		}
		return "";
	}
	public static void main(String[] args) {
		TestDaten td = new TestDaten();
		String[] woerter = td.erzeuge();
		System.out.println(erstesWort(woerter, x -> x.startsWith("A")));
		System.out.println(erstesWort(woerter, x -> x.contains("au")));
		System.out.println(erstesWort(woerter, x -> x.endsWith("suppe")));
		System.out.println(erstesWort(woerter, x -> x.length() == 8));
	}

}
