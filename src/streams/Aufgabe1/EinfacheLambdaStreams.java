package streams.Aufgabe1;

import java.util.Arrays;
import java.util.List;
public class EinfacheLambdaStreams {
    public static void main(String[] args) {
        List <String > list = Arrays.asList("Alfons", "Rocko", "Willhelm",
                "Henrietta", "Heidrun", "Leonie");
        methodA(list);
        System.out.println();
        methodB(list);
        System.out.println();
        methodC(list);
        System.out.println();
        methodD(list);
    }

    public static void methodA(List <String > list) {
        // A: alphabetisch sortiert aus, die mit einem H beginnen
        list
                .stream()
                .sorted()
                .filter(a -> a.startsWith("H"))
                .forEach(System.out::println);
    }

    // L¨ange nach vom k¨urzesten zum l¨angsten Namen & mehr als 5 Zeichen beinhalten
    public static void methodB(List <String> list) {
        list
                .stream()
                .sorted((a,b) -> a.length()-b.length())
                .filter(a -> a.length()>5)
                .forEach(System.out::println);
    }

    // Kehren Sie alle Namen um, indem die Buchstaben jedes Namens in umgekehrte Reihenfolge gebracht werden.
    // Geben Sie anschließend vier der modifizierten Namen auf der Konsole aus.
    public static void methodC(List <String> list) {
        list
                .stream()
                .map(a -> {
                    String reverse = "";
                    for(int i = a.length() - 1; i >= 0; i--){
                        reverse += a.charAt(i);
                    }
                    return reverse;
                })
                .limit(4)
                .forEach(System.out::print);
    }

    // Ersetzen Sie jeden Namen durch seine L¨ange und entfernen Sie doppelte Werte. Summieren
    // Sie anschließend die verbliebenen Zahlen auf und speichern Sie den Wert in einer passenden
    // Variable. Geben Sie deren Wert auf die Konsole aus.
    public static void methodD(List <String> list) {
        double counter = list.stream()
                .map(a -> a.length())
                .distinct()
                .mapToInt(a -> Integer.valueOf(a))
                .sum();
        System.out.println(counter);
    }
}
