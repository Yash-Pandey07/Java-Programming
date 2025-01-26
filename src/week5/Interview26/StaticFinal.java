package week5.Interview26;

class Demo1 {
    static int a =10;
    final int b =20;

    static int count = 0; // Static variable

    void incrementCount() {
        count++;  // This modifies the static variable
    }

    final int value; // Instance variable, final

    Demo1(int value) {
        this.value = value; // Final variables can be initialized only once
    }

    void printValue() {
        System.out.println(value);
    }
}
public class StaticFinal {

    public static void main(String[] args) {
        Demo1 obj1 = new Demo1(15);
        Demo1 obj2 = new Demo1(16);
//        obj1.printValue();
        Demo1.a = 11;
        int aa = Demo1.a;
        int bb = Demo1.a;
        Demo1.a = 12;
        System.out.println(aa);
        System.out.println(bb);
//        obj2.b = 12;
        System.out.println(obj1.b);
        System.out.println(obj2.b);

    }



}
