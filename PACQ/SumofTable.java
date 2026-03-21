
import java.util.Scanner;

/*
 * Given a number N, your task is to calculate and print the sum of the table of N.
Sample test case 1:
Input:
N = 10
ouput: 55 * 10 = 550
550
Sample test case 2:
Input:
N = 68 N * (1-10) -> 55 * 68 = 3740
ouput:
3740
 */

public class SumofTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i=0;i<10;i++){
            sum +=(i+1)*N;
        }
        System.out.println(sum);
    }
}
