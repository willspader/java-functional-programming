package finalsection;

import java.util.function.BiFunction;

public class Lambdas {

    public static void main(String[] args) {

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            if (name.isBlank()) throw new IllegalArgumentException("");
            if (age < 0) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Will", 21));
    }

}
