
import java.util.Scanner;

/*
Problem Statement:
    You are given two integers m and n. Find the m-th prime number, calculate the digit sum of that number repeatedly 
    until it becomes a single digit, and then multiply the prime by that digit.

Input Format:
    m n
    (Two integers separated by space)

Output Format:
    The required result as described above (an integer)

Sample Cases:
Input 1:
    6 8

Output 1:
    52

Explanation:
    The 6th prime number is 13
    Digit sum: 1 + 3 = 4
    Multiply: 13 × 4 = 52

Input 2:
    10 50

Output 2:
    58

Explanation:
    The 10th prime number is 29
    Digit sum: 2 + 9 = 11; 1 + 1 = 2
    Multiply: 29 × 2 = 58
*/

public class PrimeDigitSumMultiplication {
    static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num);i++){
            if(num % i == 0)return false;
        }
        return true;
    }

    static int findMthPrime(int m){
        int count = 0;
        int num = 2;
        while(count < m){
            if(isPrime(num)){
                count++;
            }
            num++;
        }
        return num - 1; // Return the m-th prime number
    }

    static int calculateDigitSum(int num){
        while(num >= 10){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num; // Return the single digit result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int prime = findMthPrime(m);
        int digitSum = calculateDigitSum(prime);
        int result = prime * digitSum;
        System.out.println(result);
    }
    
}