package interfaceClass;

interface Drawable {
    void draw();

    default void msg() {
        System.out.println("Drawable msg method");
    }
}

class Rectangle2 implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
    public void msg(){
        Drawable.super.msg();
        System.out.println("Rectangle2 msg method");
    }
}

public class TestInterfaceDefault {
    public static void main(String[] args) {
        Drawable d = new Rectangle2();
        d.draw();
        d.msg();


    }

}
