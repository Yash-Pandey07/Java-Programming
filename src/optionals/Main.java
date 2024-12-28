package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional.ofNullable(null)           //passs the email or if null is passed
//                .orElseGet(() -> "Default Value");
        .ifPresentOrElse(
                email -> System.out.println("Sending email to "+ email),
                () -> System.out.println("Can't send email ")
        );
//        System.out.println(value);

    }
}
