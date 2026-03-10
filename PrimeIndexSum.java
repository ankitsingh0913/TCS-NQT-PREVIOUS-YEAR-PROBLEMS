/*
Problem Statement:
    You are given two numbers X and Y.
    Your task is to:
    Find the Xth prime number (call this value A).
    Find the Yth prime number (call this value B).
    Compute the value of C = (A + B) − 1.


Input Format:
    Two integers, X and Y, separated by a space.

Output Format:
    A single integer, the value of C.

Sample Cases:

Sample Input 1:
    2 3

Sample Output 1:
    7

    Explanation:
    The 2nd prime is 3, the 3rd prime is 5.
    C = (3 + 5) − 1 = 7

Sample Input 2:
    5 3

Sample Output 2:
    15

Explanation:
    The 5th prime is 11, the 3rd prime is 5.
    C = (11 + 5) − 1 = 15
*/

public class PrimeIndexSum {

    static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
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


    public static void main(String[] args) {
        int X = 2; // Example input
        int Y = 3; // Example input

        int A = findNthPrime(X);
        int B = findNthPrime(Y);
        int C = (A + B) - 1;

        System.out.println(C);
    }
    
}
