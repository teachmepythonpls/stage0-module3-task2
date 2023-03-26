package lang.print.gaps.task2;

public class advancedNamingConvention {
    private static final int ADULT_AGE = 18;
    private int age;
    private int phoneNumber;

    void callToFriend() {
        if (age >= ADULT_AGE) {
            System.out.println("Calling a friend...");
            System.out.println("Friend's phone number is " + phoneNumber);
        } else {
            System.out.println("Sorry, you are not old enough to call a friend.");
        }
    }

    void callByNumber(int number) {
        if (number == phoneNumber) {
            System.out.println("Calling " + number + "...");
            // Some code to make the phone call
        } else {
            System.out.println("Sorry, this number is not in your contact list.");
        }
    }
}

