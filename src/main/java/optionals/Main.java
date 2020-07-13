package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        System.out.println(value);

        Optional.ofNullable("john@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email")
                );
    }

}
