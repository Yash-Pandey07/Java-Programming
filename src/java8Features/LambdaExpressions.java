package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "C++");
        System.out.println("Languages which starts with 'J':");
        filter(languages, (str) -> str.startsWith("J"));
    }
    public static void filter(List<String> names, Predicate<String> condition) {
        for(String name: names)  {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }
}
