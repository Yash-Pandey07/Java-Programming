package constructor;

public class Example implements AutoCloseable {
    // Constructor
    public Example() {
        System.out.println("Object created");
    }

    // Override the close method
    @Override
    public void close() {
        System.out.println("Object is being closed");
        // Perform cleanup actions here
    }

    public static void main(String[] args) {
        try (Example example = new Example()) {
            // Use the object
        } // The close method is automatically called here
    }
}
