package Week3;

//Inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
//Interface
interface Movable {
    void move();
}
class Car1 implements Movable {
    public void move() {
        System.out.println("Car1 moves");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // Outputs: Dog barks
        Car1 c = new Car1();
        c.move();

    }
}