package week5.Interview26;

public class PrimitiveCallByValue {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before method call: " + number);

        modifyValue(number); // Passing 'number' by value
        System.out.println("After method call: " + number);
    }

    public static void modifyValue(int num) {
        num = 20; // This modifies the copy, not the original
        System.out.println("Inside method: " + num);
    }
}
