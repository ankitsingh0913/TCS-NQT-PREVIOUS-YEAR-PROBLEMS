/*
Problem Statement:
    Given two temperatures, classify each based on the following criteria:
    If the temperature is less than 10, print: "it's very cool"
    If the temperature is between 10 and 20 (inclusive), print: "it's cold"
    If the temperature is greater than 20, print: "it's warm"
Then:
    Print the category for each temperature (in the order given).
    Print their average (as a double/float).
    Print both temperatures in reverse order.

Input Format:
    Two space-separated integers, representing the temperatures.

Output Format:
    A single line with the following values, separated by commas:

    Category of first temperature
    Category of second temperature
    Average of both temperatures (as a double/float)
    Second temperature
    First temperature

Sample Case:
Input:
    5 25
Output:
    it's very cool, it's warm, 15.0, 25, 5 */

import java.util.Scanner;

public class AverageTemperatureClassifier {

    static String classifyTemperature(int temp) {
        if (temp < 10) {
            return "it's very cool";
        } else if (temp <= 20) {
            return "it's cold";
        } else {
            return "it's warm";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp1 = sc.nextInt();
        int temp2 = sc.nextInt();

        String category1 = classifyTemperature(temp1);
        String category2 = classifyTemperature(temp2);

        double average = (temp1 + temp2) / 2.0;

        System.out.println(category1 + ", " + category2 + ", " + average + ", " + temp2 + ", " + temp1);
    }
}
