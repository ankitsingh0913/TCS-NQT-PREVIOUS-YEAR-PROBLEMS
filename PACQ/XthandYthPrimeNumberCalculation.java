/*
Given two integers X and Y, find the Xth and Yth prime numbers in the sequence of prime numbers.
Let:
    A = Xth prime number
    B = Yth prime number
    Then, calculate C using the formula:
    C=(A×B)−1C = (A \times B) - 1C=(A×B)−1Finally, print the value of C.

Example
Input:
5 2
Output:
32
Explanation:
The sequence of prime numbers: 2, 3, 5, 7, 11, ...
X = 5 → A = 11 (5th prime)
Y = 2 → B = 3 (2nd prime)
C = (11 × 3) − 1 = 33 − 1 = 32

*/

import java.util.Scanner;

public class XthandYthPrimeNumberCalculation {

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        } else {
            for(int var1 = 2; (double)var1 <= Math.sqrt((double)num); ++var1) {
            if (num % var1 == 0) {
                return false;
            }
        }
        return true;
        }
    }

    static int findNthPrime(int n){
        int count = 0;
        int num = 1;
        while(count < n){
            num++;
            if(isPrime(num)){
                count++;
            }
        }
        return num;
    }

    static int calculateC(int A, int B){
        int c = findNthPrime(A) * findNthPrime(B) - 1;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println(calculateC(X,Y));
    }
    
}
