package week4;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3);

        for(int i=0;i<values.size() ;i++){
            System.out.println(values.get(i));
        }

        for(int i : values){
            System.out.println(i);
        }

        values.forEach(i -> System.out.println(i));
    }

}
