package Dynamic_Programming;

import java.util.Scanner;

public class fibonacci {
    static int N = (int) (1e3+2);
    static int[] dp = new int[N];

    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = fib(n-1) + fib(n-2);
        return dp[n];
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<N;i++){
            dp[i] = -1;
        }
        // System.out.println(fib(n));
        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i=2; i<=n; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println(fibonacci[n]);
        sc.close();
    }
    
}
