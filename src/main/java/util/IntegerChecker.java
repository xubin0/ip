package util;

public class IntegerChecker {
    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);  // Try converting to an integer
            return true;  // If successful, return true
        } catch (NumberFormatException e) {
            return false; // If an exception occurs, it's not an integer
        }
    }
}