package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("William", Gender.MALE),
                new Person("Spader", Gender.MALE),
                new Person("Eduarda", Gender.FEMALE),
                new Person("Fernanda", Gender.FEMALE),
                new Person("Roger", Gender.MALE)
        );

        System.out.println("Imperative approach");
        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("\nDeclarative approach");
        // Declarative approach
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);
    }

    static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }

}
