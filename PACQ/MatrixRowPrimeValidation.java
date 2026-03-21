/*
Problem Statement:
Given m and n, followed by m × n integers as a matrix, check if each row has at least one prime.

Conditions:
    If m <= 0 or n <= 0, print "Wrong Input"
    If any matrix element is negative, print "Wrong Input"
    If total elements < m × n, print "Wrong Input"
    If all rows contain at least one prime, print "Valid"
    If any row doesn’t have a prime, print "Not Valid"

Sample Cases:
Input 1:
    2 3 4 6 5 7 8 10

Output 1:
    Valid

Input 2:
    2 2 4 6 8 10

Output 2:
Not Valid
*/

import java.util.Scanner;

public class MatrixRowPrimeValidation{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[] arr = new int[m * n];
        boolean wrong = false;
        for (int i = 0; i < m * n; i++) {
            if (!sc.hasNextInt()) { wrong = true; break; }
            arr[i] = sc.nextInt();
            if (arr[i] < 0) wrong = true;
        }
        if (m <= 0 || n <= 0) System.out.println("Wrong Input");
        else if (wrong) System.out.println("Wrong Input");
        else {
            boolean valid = true;
            for (int i = 0; i < m; i++) {
                boolean found = false;
                for (int j = 0; j < n; j++) {
                    int x = arr[i * n + j];
                    if (x > 1) {
                        boolean isPrime = true;
                        for (int d = 2; d * d <= x; d++)
                            if (x % d == 0)
                                isPrime = false;
                        if (isPrime) found = true;
                    }
                }
                if (!found) { valid = false; break; }
            }
            System.out.println(valid ? "Valid" : "Not Valid");
        }
    }
}