package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("William", Gender.MALE),
                new Person("Spader", Gender.MALE),
                new Person("Eduarda", Gender.FEMALE),
                new Person("Fernanda", Gender.FEMALE),
                new Person("Roger", Gender.MALE)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        Predicate<Person> isFemalePredicate = person -> Gender.FEMALE.equals(person.gender);

        boolean constainsOnlyFemales = people.stream()
                .anyMatch(isFemalePredicate);

        System.out.println(constainsOnlyFemales);


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
