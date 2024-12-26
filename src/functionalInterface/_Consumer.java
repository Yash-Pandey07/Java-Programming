package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    static class Customer {
        public static void main(String[] args) {
            Customer maria = new Customer("Maria", "99999");
            Customer john = new Customer("John", "88888");
            greetCustomer(maria);
            greetCustomerConsumer.accept(john);
            greetCustomerBiConsumer.accept(maria, false);
            greetCustomerBiConsumer.accept(john, true);
        }

        static Consumer<Customer> greetCustomerConsumer = customer ->
                System.out.println("Hello " + customer.customerName +
                        " thanks for registering phone number " +
                        customer.customerPhoneNumber);


        static void greetCustomer(Customer customer) {
            System.out.println("Hello " + customer.customerName +
                    " thanks for registering phone number " + customer.customerPhoneNumber);

        }

        //BiConsumer
        static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
                System.out.println(STR."Hello \{customer.customerName} thanks for regestering phone number \{showPhoneNumber ? customer.customerPhoneNumber : "*****"}");

        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
