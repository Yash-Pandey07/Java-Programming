package Main;

public abstract class abstraction_class {

//    abstract classes are defined using the abstract keyword.

    // Abstract method
    public abstract double area();
    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }

//    A method which is declared as abstract and does not have implementation is known as an abstract method

    abstract void printStatus();//no method body and abstract

//    Example of Abstract Class that has an Abstract Method

//
//    abstract class Bike{
//        abstract void run();
//    }
//    class Honda4 extends Bike{
//        void run(){System.out.println("running safely");}
//        public static void main(String args[]){
//            Bike obj = new Honda4();
//            obj.run();
//        }
//    }


    public static void main(String args[]){
        // Example of Abstract Class in Java
        Bank b;
        b=new SBI();
//        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new PNB();
//        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");

        //Abstract Class Having Constructor, Data Member and Methods
        Bike obj = new Honda();
//        obj.run();
//        obj.changeGear();

        //another eg

        A a=new M();
        a.a();
        a.b();
        a.c();
        a.d();

    }

}
// Example of Abstract Class in Java
abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){return 7;}
}
class PNB extends Bank{
    int getRateOfInterest(){return 8;}
}
//Example of an abstract class that has abstract and non-abstract methods
abstract class Bike{
    Bike(){System.out.println("bike is created");}
    abstract void run();
    void changeGear(){System.out.println("gear changed");}
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    void run(){System.out.println("running safely..");}
}


//Another eg
interface A{
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A{
    public void c(){System.out.println("I am c");}
}

class M extends B{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}