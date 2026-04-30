package Dynamic_Programming;

import java.util.Scanner;

public class MinNumberOfSquare {

    static int N = (int) (1e5+2);
    static int[] dp = new int[N];

    public static int minSquare(int n){
        if(n == 0){
            return 0;
        }
        if(dp[n] != N){
            return dp[n];
        }
        for(int i = 1;i*i<=n;i++){
            dp[n] = Math.min(dp[n], 1 + minSquare(n - i*i));
        }
        return dp[n];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<N; i++){
            dp[i] = N;
        }
        System.out.println(minSquare(n));
        sc.close();
    }
    
}
