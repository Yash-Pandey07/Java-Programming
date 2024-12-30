package constructor;

public class Class1 {

    int x ,y;
    static int z;

    Class1() {
//        x = 5;
//        y = 6;
        System.out.println("Default Constructor is called !");
    }
    Class1(int x , int y) {
        this.x = x;
        this.y = y;
        System.out.println("Custom Constructor is called !");
    }
    void f1() {
        System.out.println("F1 ");
        System.out.println(x +" " +y);
    }
    void f2() {
        System.out.println("F2 ");
        System.out.println(x +" " +y);
    }


}
