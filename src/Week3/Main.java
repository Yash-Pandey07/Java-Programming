package Week3;

public class Main {
    // Standard main method
    public static void main(String[] args) {
        System.out.println("Standard main method");

        // Calling overloaded main methods
        main(10);
        main("Hello");
    }

    // Overloaded main method with an integer parameter
    public static void main(int num) {
        System.out.println("Overloaded main method with int: " + num);
    }

    // Overloaded main method with a string parameter
    public static void main(String str) {
        System.out.println("Overloaded main method with String: " + str);
    }
}
