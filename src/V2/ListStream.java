package V2;

import java.util.*;

public class ListStream {
    public static void main(String[] args) {
        List<String> namen = Arrays.asList("Dietmar", "Ratz", "Jens", "Scheffler", "Detlef", "Seese", "Jan", "Wiesenberger");

        for(int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }

        namen
                .stream()
                .map(String::toUpperCase)
                .filter(s -> !s.contains("E"))
                // sorted hat einen Comparator der entsprechend einen Wert >0, <0 oder =0 zurückgibt; wenn >0 rauskommt ist t kleiner als s, =0 sind beide gleich groß, bei <0 t>s
                .sorted((s, t) -> t.length()-s.length())
                .forEach(n -> System.out.print(n + " "));

        for(int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }
    }
}