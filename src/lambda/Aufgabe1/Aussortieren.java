package lambda.Aufgabe1;

public class Aussortieren {
	public static int[] reduziertesArray (int[] ia, Pruefung prfg) {
		int n = 0;
		for( int x = 0;x<ia.length;x++) {
			if(prfg.istErfolgreichFuer(ia[x]) == true) {
				n = n + 1;
			}
		}
		int[] arr = new int[n];
		int z = 0;
		for( int x = 0;x<ia.length;x++) {
			if(prfg.istErfolgreichFuer(ia[x]) == true) {
				arr[z] = ia[x];
				z = z + 1;
			}
		}
		return arr;
	}
	public static void ausgabe (String text, int[] ia) {
		System.out.print(text + ":   ");
		for(int x = 0;x<(ia.length - 1);x++ ) {
			System.out.print(ia[x] + " | ");
		}
		System.out.println(ia[(ia.length - 1)]);
	}
	public static void main(String[] args) {
		int[] zahlen = new int[30];
		for(int x = 0;x<zahlen.length;x++) {
			zahlen[x] = (int) (Math.random()*200)-100;
		}
		ausgabe("x", reduziertesArray(zahlen,x -> true));
		ausgabe("x<0", reduziertesArray(zahlen,x -> x<0));
		ausgabe("x%2==0", reduziertesArray(zahlen,x -> x%2==0));
		ausgabe("x%7==0", reduziertesArray(zahlen,x -> x%7==0));
		ausgabe("x == Quadratzahl", reduziertesArray(zahlen,x -> Math.sqrt(x)%1==0));
	}
}
