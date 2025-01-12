package week4;


interface A{
    void show();
    default void outPut(){
        System.out.println("Interface A");
    }
}
interface  B{
    default void outPut(){
        System.out.println("Interface B");
    }
}
class C implements A,B{

    public void show(){
        System.out.println("CLass B");
    }

    @Override
    public void outPut() {
        A.super.outPut();
    }

}
public class LambdaClass {
    public static void main(String[] args) {

    }
}
