package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

// Old way example
public class CustomerValidatorService {

    private boolean isEmailValid(String email) {
        // just for learning purposes
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        // just for learning purposes
        return phoneNumber.startsWith("+0");
    }

    private boolean isAdult(LocalDate dob) {
        // just for learning purposes
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber()) &&
                isAdult(customer.getDob());
    }

}
