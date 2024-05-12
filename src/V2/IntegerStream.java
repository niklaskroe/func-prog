package V2;

import java.util.stream.*;

public class IntegerStream {
    public static void main(String[] args) {
        IntStream is = IntStream.range(1,100).map(x -> x*x).filter(x -> x%2==0);

        System.out.println("Summe aller geraden Quadratzahlen " +
                "zwischen 1 und 9801: " + is.sum());
    }
}
