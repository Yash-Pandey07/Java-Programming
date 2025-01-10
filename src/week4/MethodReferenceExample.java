package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Method", "References");
        // Static Method Reference: Converting all strings to uppercase
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase) // static method reference
                .collect(Collectors.toList());
        System.out.println("Uppercase Words: " + upperCaseWords);
        // Instance Method Reference of an Arbitrary Object of a Particular Type
        System.out.println("Printing each word:");
        words.forEach(System.out::println); // instance method reference
        // Constructor Reference: Creating new instances
        Supplier<List<String>> listSupplier = ArrayList::new; // constructor reference
        List<String> newList = listSupplier.get();
        newList.addAll(words);
        System.out.println("New List: " + newList);
        // Additional Example: Using Function Interface for Constructor Reference
        Function<String, Integer> stringToInteger = Integer::new; // constructor reference
        Integer number = stringToInteger.apply("100");
        System.out.println("String to Integer: " + number);
    }
}