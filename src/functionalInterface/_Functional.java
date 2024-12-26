package functionalInterface;

import java.util.function.Function;

public class _Functional {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);
        addBy1AndThenMultiplyBy10.apply(1);
    }

    static Function <Integer,Integer> incrementByOneFunction = number -> number +1;

    static Function <Integer, Integer> multiplyBy10 = number -> number * 10;

    static int incrementByOne(int number){
        return number + 1 ;
    }
}
