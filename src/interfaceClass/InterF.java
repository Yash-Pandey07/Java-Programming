package interfaceClass;
interface i1{
    int x = 5;

    void f1();
    static void f2(){
        System.out.println("I1 interface F2 ");
    }
}
interface i2 extends i1{
    int y=-5;
    int x= 55;
    static void f2(){
        System.out.println(x);
    }
    void f3();

}

class c1 implements i2{
    public void f1(){
        System.out.println("C1 class , F1 method ");
    }
    public void f3(){
        System.out.println("C1 class , F3 method ");
    }
    public void f2(){
        System.out.println("C1 class , F2 method ");
    }
}
public class InterF {
    public static void main(String[] args) {
        i1.f2();
        System.out.println(i2.x);
        c1 classObject = new c1();
        classObject.f1();
        classObject.f2();
        classObject.f3();
        System.out.println(classObject.y);

    }
}
