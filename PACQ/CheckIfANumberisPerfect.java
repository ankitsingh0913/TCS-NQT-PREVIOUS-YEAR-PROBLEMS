
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckIfANumberisPerfect{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        if (n <= 1) { System.out.println("False"); return; }

        long sum = 1;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) sum += n / i;
            }
        }
        System.out.println(sum == n ? "True" : "False");
        
    }
}