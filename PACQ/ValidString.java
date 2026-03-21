// Given a string S consisting only of the characters '*' and '#'. The length of the string can be variable.
// The task is to find the minimum number of '*' or '#' to make it a valid string.
// A string is considered valid if:
// The number of '*' and '#' are equal.
// The '*' and '#' can be at any position in the string.
// Note:
// The output will be a positive, negative, or zero integer based on the counts:
// If (* count > # count) → output positive integer
// If (# count > * count) → output negative integer
// If (* count = # count) → output 0

// Example 1
// Input:
// ###***   → Value of S
// Output:
// 0   → Number of '*' and '#' are equal

import java.util.Scanner;

public class ValidString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int countStar = 0;
        int countHash = 0;

        for(char c : s.toCharArray()) {
            if (c == '*') {
                countStar++;
            } else if (c == '#') {
                countHash++;
            }
        }
        int result = countStar - countHash;
        System.out.println(result);
        scanner.close();
    }
}
