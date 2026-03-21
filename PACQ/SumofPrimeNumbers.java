
import java.util.Scanner;

/*
Problem Statement:
    Given two integers M and N, calculate the sum of prime numbers starting from the Mth prime number to the (M+N)th 
    prime number inclusive.

Input Format:
    Two integers, M and N.

Output Format:
    The sum as an integer.

Sample Case:
Input:
    M = 6, N = 2

Output:
    49

Explanation:
    The 6th prime number is 13
    The 7th prime number is 17
    The 8th prime number is 19
    So, the sum = 13 + 17 + 19 = 49
*/

public class SumofPrimeNumbers {

    static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num);i++){
            if(num % i == 0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int count = 0;
        int num = 2;

        while(count < M + N){
            if(isPrime(num)){
                count++;
                if(count >= M){
                    sum += num;
                }
            }
            num++;
        }

        System.out.println(sum);

    }
    
}
