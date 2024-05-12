package V2.blatt02.Aufgabe1;

import java.util.*;

public class Liste {
    public static void main(String[] args) {
        List<String> namen = Arrays.asList("Dietmar", "Ratz", "Jens", "Scheffler", "Detlef", "Seese", "Jan", "Wiesenberger");

        for(int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }

        namen
                .stream()
                .map(String::toUpperCase)
                .filter(s -> !s.contains("E"))
                .sorted((s, t) -> t.length()-s.length())
                .forEach(n -> System.out.print(n + " "));

        for(int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }
    }
}