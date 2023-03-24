package lang.print.gaps.task2;

public class advancedNamingConvention {
    private static final int adult_age = 18;

    private int age;
    private int phoneNumber;
    int Number = 15;
    int sum = adult_age + Number;

    void callToFriend() {
        System.out.println("Calling a friend by number"+phoneNumber);
    }

    void callByNumber(int Number) {
        System.out.println(Number + adult_age + "equals to " + sum);
    }
}

