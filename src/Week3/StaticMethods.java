package Week3;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;

public class StaticMethods {

    public static void main(String[] args) {

        Student a = new Student("A");
        Student b = new Student("B");
        Student c = new Student("C");

//        System.out.println(b.toString());
//        System.out.println(c.toString());
//        System.out.println(b.compareTo(a));

        /*
        if (args.length > 0) {
            System.out.println("First argument: " + args[0]);
        } else {
            System.out.println("No arguments provided.");
        }
        */

        //Interfaces
        Car ford = new Car();
        ford.speedUp(50);
        ford.changeGear(4);
//        ford.display();
//        int min = 1, max = 3, range = max - min + 1;
//
//        int rand1 = (int) (Math.random() * range) + min;
        LevelEnum randomEnum = getRandomEnum(LevelEnum.class);
//        System.out.println(rand1);
        LevelEnum lv1 = LevelEnum.High;
        System.out.println("Lvl 1 = "+lv1);
        System.out.println("Random ENUM = " + randomEnum);

        LevelEnum[] arr = LevelEnum.values();
        System.out.print("LevelEnum array = ");
        System.out.println(Arrays.toString(arr));

    }

    public static <T extends Enum<?>> T getRandomEnum(Class<T> enumClass) {
        Random random = new Random();
        int x = random.nextInt(enumClass.getEnumConstants().length);
        return enumClass.getEnumConstants()[x];
    }
}


/*
Public Class
You can have multiple classes in a single file,
but only one of them can be public. The other classes will have package-private access by default,
meaning they are accessible only within the same package.

Static Methods

*/