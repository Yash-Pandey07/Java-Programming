package constructor;

class Parent {
    int x;
    int y;
    private int commonVarible;

    Parent() {
        x = -1;
        y = -2;
        commonVarible = -99;
        System.out.println("Default Parent variables " + x + " - " + y);
    }

    Parent(int a, int b) {
        x = a;
        y = b;
        System.out.println("User Parent variables " + x + " - " + y);
    }

    void f1() {
        System.out.println("Parent F1 ");
        System.out.println("F1 Parent variables " + x + " - " + y);
    }

    void f2() {
        System.out.println("Parent F2 ");
        System.out.println("F2 Parent variables " + x + " - " + y);
    }

    void display() {
        System.out.println("Parent commonVarible " + commonVarible);
        System.out.println("Parent Super varibles " + x + "  " + y);
    }

    String name = "Parent";

    void display1() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    int o, p, x, y;
    int commonVarible;

    Child() {
        super(44, 45);
        o = -10;
        p = -11;
        commonVarible = -88;
        System.out.println("Default Child variables " + o + " - " + p);
    }

    Child(int x, int y) {
        o = x;
        p = y;
        System.out.println("User Child variables " + o + " - " + p);
    }

    void f3() {
        System.out.println("Child F3 ");
        System.out.println("F3 Child variables " + o + " - " + p);
    }

    void superFunction(int x, int y) {
        super.x = x;
        super.y = y;

    }

    void display() {
        System.out.println("Child commonVarible " + commonVarible);
        System.out.println("Child Super varibles " + x + "  " + y);
    }

    String name = "Child";

    void display1() {
        System.out.println("This is the child class.");
    }

    void show() {
        System.out.println("Name in child class: " + name);
        System.out.println("Name in parent class: " + super.name);
        display1();
        super.display1();
    }
}

public class Class2 {
    public static void main(String[] args) {
//        Child c1 = new Child();
//        Parent p1 = new Parent();
//        c1.f3();
//        c1.f1();
//        c1.f2();
//        c1.superFunction(77, 78);
//        c1.display();
//        p1.display();
        Child child = new Child();
        child.show();
    }
}
