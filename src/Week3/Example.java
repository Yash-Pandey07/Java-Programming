package Week3;

public class Example {
    public static void main(String[] args) {
//        System.out.println("Main");
//        fun1();
//        fun2();
        Area a = new Area();
//        a.fun1();
//        Area.fun2();
//        a.fun3();

        //Wrapper class
//        Integer IntergerNumber ;
        Area b = new Area();
        a.x = 1;
//        System.out.println(a.x + "," + a.y);


        // Primitive int
        int num = 5;

        // Wrapper class Integer
         Integer wrappedNum = Integer.valueOf(num);

        // Using wrapper class methods
         int parsedNum = Integer.parseInt("123");
    }


    static void fun1() {
        System.out.println("fun1");
    }

    static void fun2() {
        System.out.println("fun2");
    }
}

class Area {

    int x, y;

    public static void fun2() {
        System.out.println("Area 2");
    }

    public void fun1() {
        System.out.println("Area 1");
    }

    void fun3() {
        System.out.println("Area 3");
    }
}
