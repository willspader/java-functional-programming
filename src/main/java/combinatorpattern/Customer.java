package combinatorpattern;

import java.time.LocalDate;

public class Customer {

    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;
    private final String name;

    public Customer(String name, String email, String phoneNumber, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }
}
