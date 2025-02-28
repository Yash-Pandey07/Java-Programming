package FunctionalProgramming;

import javax.lang.model.type.DeclaredType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static FunctionalProgramming.Main.Gender.*;

public class Main {
    public static void main(String[] args) { 
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Mickel", MALE),
                new Person("Anna", FEMALE),
                new Person("Lilly", FEMALE),
                new Person("Gloria", FEMALE)
        );

//        Imperative approach
        System.out.println("// Imperative approach");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }
//        Declarative approach
        System.out.println("// Declarative approach");

        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
//                .toList()
                .forEach(System.out::println);
//        static methods in a class only
        /*
        fun1();
        Class2 obj1 = new Class2();
        obj1.fun1();
        obj1.fun2();
        obj1.x = 5;
        System.out.println(obj1.x);
        */
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
        MALE, FEMALE;
    }

    static void fun1() {
        System.out.println("Fun1");
    }

}

//static methods in a class only
class Class2 {
    int x, y;

    void fun1() {
        System.out.println("Fun1");
    }

    void fun2() {
        System.out.println("Fun2");
    }
}
