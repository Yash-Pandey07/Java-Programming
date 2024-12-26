package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Only Number starting with 9 and having 10 digit are valid ");
        System.out.println("Without Predicate - ");
        System.out.println("9131972802 number is valid = " + isPhoneNumberValid("9131972802"));
        System.out.println("8131972802 number is valid = " + isPhoneNumberValid("8131972802"));
        System.out.println("With    Predicate - ");
        System.out.println("91319728022 number is valid = " + isPhoneNumberValidPredicate.test("91319728022"));
        System.out.println("81319728022 number is valid = " + isPhoneNumberValidPredicate.test("81319728022"));
        System.out.println("Using multiple Predicate at the same line");
        System.out.println("Validate the number and check if it contains 3");
        System.out.println("9131972803 number is valid and it contains 3  = "+ isPhoneNumberValidPredicate.and(isPhoneNumberContains3).test("9131972903"));
        System.out.println("9141972804 number is valid and it contains 3  = "+ isPhoneNumberValidPredicate.and(isPhoneNumberContains3).test("9141972904"));
    }
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("9") && phoneNumber.length() == 10;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("9") && phoneNumber.length() == 10;

//    Multiple Predicate can be used all together
    static Predicate<String> isPhoneNumberContains3 = phoneNumber ->
        phoneNumber.contains("3");
}
