package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static streams._Streams.Gender.FEMALE;
import static streams._Streams.Gender.MALE;
import static streams._Streams.Gender.PREFER_NOT_TO_SAY;

public class _Streams {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Mickel", MALE),
                new Person("Anna", FEMALE),
                new Person("Lilly", FEMALE),
                new Person("Gloria",FEMALE),
                new Person("Ivan", PREFER_NOT_TO_SAY)
        );

        people.stream()
//                .map(person -> person.gender)
                .map(person -> person.name)
                .mapToInt(String::length)
//                .collect(Collectors.toSet())
                .forEach(System.out::println);

        Set<Gender> genders = people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet());


//        System.out.println(genders);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
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
        MALE, FEMALE, PREFER_NOT_TO_SAY;
    }
}
