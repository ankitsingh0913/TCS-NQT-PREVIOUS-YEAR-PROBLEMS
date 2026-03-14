/*
Problem Statement:
    Given two strings s1 and s2, check if they are anagrams.
    If their lengths are not equal or any input is empty, print "Invalid Input".
    If both strings have the same characters with the same frequency, print "true", else print "false".

Input Format:
    Two space-separated strings, s1 and s2.

Output Format:
    Print "Invalid Input" if the inputs are empty or their lengths are not equal.
    Print "true" if the strings are anagrams, otherwise print "false".

Sample Case:
Input:
    abaac aabca

Output:
    true
*/

public class AnagramCheck {

    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Invalid Input");
            return false;
        }

        int[] charCount = new int[26]; 

        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        String str1 = "abaac"; // Example input
        String str2 = "aabca"; // Example input

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}