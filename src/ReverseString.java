/**
 * Problem Statement:
 * Reverse a given string with best time and space complexity
 */

public class ReverseString {

    public static String reverseString(String inpuString) {

        String reverseString  = "";

        for(int i = 0; i < inpuString.length(); i++) {
            reverseString = reverseString + inpuString.charAt(inpuString.length() - i - 1);
        }
        return reverseString;
    }
}