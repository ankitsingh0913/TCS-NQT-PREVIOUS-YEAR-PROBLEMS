/*
Problem Statement:
    Given an array of integers, calculate the mean and then compute the standard deviation using the formula:
    Standard Deviation = sqrt(Σ(xi - mean)² / n-1)
    Print the result as a double with 2 decimal places.

Input Format:
    A space-separated list of integers.

Output Format:
    The standard deviation as a double, rounded to 2 decimal places.

Sample Case:
Input:
    5 2 4 4 5
Output:
    1.22

*/

public class StandardDaviation {

    static double calculateStandardDeviation(int[] numbers) {

        int n = numbers.length;
        double mean = 0;
        for(int x : numbers){
            mean += x;
        }
        mean /=n;
        double sum = 0;
        for(int x : numbers){
            sum += Math.pow(x-mean,2);
        }
        return Math.sqrt(sum / (n - 1));
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 4, 4, 5}; // Example input
        double stdDev = calculateStandardDeviation(numbers);
        System.out.printf("%.2f", stdDev);
    }
}
