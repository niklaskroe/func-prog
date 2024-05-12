package streams.Aufgabe2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Person> liste = TestPersonen.erzeuge();

        liste.stream()
                .forEach(System.out::print);

        System.out.println();

        liste.stream()
                .filter(a -> a.geschlecht == 'w')
                .forEach(System.out::print);

        System.out.println();

        liste.stream()
                .filter(a -> a.geschlecht == 'm')
                .filter(a -> a.gebJahr > 2300)
                .forEach(System.out::print);

        System.out.println();

        liste.stream()
                .filter(a -> a.vorname.charAt(0) == a.nachname.charAt(0))
                .forEach(System.out::print);

        System.out.println();

        double wCount = liste.stream()
                .filter(a -> a.geschlecht == 'w')
                .count();
        System.out.println(wCount);

        System.out.println();
    }
}
