package functionalInterface;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functional {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println("incrementByOne = " + increment);
//        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
//        System.out.println(increment2);
        System.out.println("incrementByOneFunction = " + increment2);

        int multiply = multiplyBy10.apply(increment2);
        System.out.println("multiplyBy10 = "+multiply);
//FUNCTIONS
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);
        System.out.println("addBy1AndThenMultiplyBy10 = "+addBy1AndThenMultiplyBy10.apply(1));

//BIFUNCTIONS
        int addAndMultiply = incrementByOneAndMultiply(2,10);
        System.out.println("addAndMultiply = " + addAndMultiply);

        Integer addAndMultiplyByBiFunction = incrementByOneAndMultiplyByFunction.apply(2, 10);
        System.out.println("addAndMultiplyByBiFunction = " + addAndMultiplyByBiFunction);
    }

    static Function <Integer,Integer> incrementByOneFunction = number -> number +1;

    static Function <Integer, Integer> multiplyBy10 = number -> number * 10;

    static int incrementByOne(int number){
        return number + 1 ;
    }

    static int incrementByOneAndMultiply(int number , int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy ;
    }
    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyByFunction = (number ,numToMultiplyBy) -> (number + 1) * numToMultiplyBy;
}
