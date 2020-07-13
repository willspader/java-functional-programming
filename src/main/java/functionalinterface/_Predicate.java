package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09001040012"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09001040012"));

        System.out.println(
                "Is phone number valid and constains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09001040012")
        );

        System.out.println(
                "Is phone number valid and constains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("07031040012")
        );

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        // just for learning purposes
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
