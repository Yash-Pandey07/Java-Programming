package week4;


interface A {
    void show(int i);

    default void outPut() {
        System.out.println("Interface A  ");
    }
}

interface B {
    default void outPut() {
        System.out.println("Interface B ");
    }
}

class C implements A, B {

    public void show(int i) {
        System.out.println("CLass B " + i);
    }

    @Override
    public void outPut() {
        A.super.outPut();
        B.super.outPut();
    }

}

class D implements A {
    public void show(int i) {
        System.out.println("Class D " + i);
    }
}

public class LambdaClass {
    public static void main(String[] args) {

        A a;
//        a = new A() {
//            @Override
//            public void show() {
//                System.out.println("Main Lambda class");
//            }
//        };

        a = i -> System.out.println("Lambda class " + i);
        C c = new C();
        D d = new D();
        a.show(5);
        a.outPut();

        c.show(8);
        c.outPut();

        d.show(9);
        d.outPut();

    }
}
