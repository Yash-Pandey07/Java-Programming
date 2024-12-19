package Week2.Week2;

public class VariableTypeChecker {

    public static String determineType(Object variable) {
        if (variable == null) {
            return "null";
        }

        switch (variable.getClass().getSimpleName()) {
            case "Integer":
                return "Integer";
            case "Double":
                return "Double";
            case "String":
                return "String";
            case "Boolean":
                return "Boolean";
            case "Character":
                return "Character";
            default:
                return "Unknown Type";
        }
    }

    public static void main(String[] args) {
        System.out.println(determineType(123));          // Output: Integer
        System.out.println(determineType(123.45));       // Output: Double
        System.out.println(determineType("Hello"));      // Output: String
        System.out.println(determineType(true));         // Output: Boolean
        System.out.println(determineType('A'));          // Output: Character
        System.out.println(determineType(new Object())); // Output: Unknown Type
    }
}
