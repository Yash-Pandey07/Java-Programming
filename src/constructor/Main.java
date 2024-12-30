package constructor;

public class Main {
    public static void main(String[] args) {

        System.out.println("Going to create a object ");
        Class1 c1 = new Class1();
        Class1 c2 = new Class1();
        Class1 c3 = new Class1(77,88);
        System.out.println("Object created ");
        System.out.println(c1.x +" " + c1.y +" " + c1.z);
        System.out.println(c2.x +" " + c2.y +" " + c2.z);

        c1.x = 1;
        c1.y = 2;
        Class1.z = 3;
        System.out.println(c1.x +" " + c1.y +" " + c1.z);
        System.out.println(c2.x +" " + c2.y +" " + c2.z);
        System.out.println(c3.x +" " + c3.y +" " + c3.z);

        c1.f1();
        c2.f1();
        c3.f1();
    }
}
