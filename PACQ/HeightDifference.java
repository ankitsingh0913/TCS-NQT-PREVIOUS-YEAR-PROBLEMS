/*
Problem Statement:
    Given the heights of a tree for 4 consecutive weeks, calculate the difference between each week.

    If any height is negative, return "Not valid inputs".
    If any two weekly differences are the same, return that difference.
    If all differences are different, return "None".
Input Format:
    Four space-separated integers, representing the heights each week.

Output Format:
    If any height is negative, print: Not valid inputs
    If a common weekly difference exists, print that difference (as an integer)
    If all differences are different, print: None
Sample Cases:
Input 1:
    2 4 6 7
Output 1:
    2

Input 2:
    5 10 11 13
Output 2:
    None

Input 3:
    -1 3 4 5
Output 3:
    Not valid inputs
*/

public class HeightDifference {

    static String calculateHeightDifference(int[] heights) {

        int[] differences = new int[3];
        for (int i = 0; i < 3; i++) {
            if (heights[i] < 0 || heights[i + 1] < 0) {
                return "Not valid inputs";
            }
            differences[i] = heights[i + 1] - heights[i];
        }

        if (differences[0] == differences[1] || differences[0] == differences[2]) {
            return String.valueOf(differences[0]);
        } else if (differences[1] == differences[2]) {
            return String.valueOf(differences[1]);
        } else {
            return "None";
        }
    }

    public static void main(String[] args) {
        int[] heights = {5,10,11,13}; // Example input for heights
        String result = calculateHeightDifference(heights);
        System.out.println(result);
    }
}
