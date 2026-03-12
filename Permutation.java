/*
Problem Statement:
    Given a string s, return the total number of distinct permutations that can be formed using all characters of the string.

Note:
    If the string contains duplicate characters, permutations that are the same should be counted only once.

Input Format:
    A single string s.

Output Format:
    An integer representing the total number of distinct permutations.
    (Optionally, you may list all permutations as a comma-separated string for illustration.)

Sample Case:
Input:
    ABC
Output:
    6 (ABC, ACB, BAC, BCA, CAB, CBA)
*/

public class Permutation {
    public static void main(String[] args) {
        String s = "ABC4"; // Example input
        int permutations = calculatePermutations(s);
        System.out.println(permutations);
    }

    public static int calculatePermutations(String s) {
        int n = s.length();
        int res = 1;
        for(int i = 0;i<n;i++){
            res *= (i+1);
        }
        return res;

    }
}
