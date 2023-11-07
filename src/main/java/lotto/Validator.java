package lotto;

public class Validator {

    static void isInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR]");
        }
    }

    static void isInRange(int input) {
        if (input >= 1 & input <= 45) {
            return;
        }
        throw new IllegalArgumentException("[ERROR]");
    }

    static void isMultipleOfThousand(int input) {
        if ((input % 1000) == 0) {
            return;
        }
        throw new IllegalArgumentException("[ERROR]");
    }


}
