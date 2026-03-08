
import java.util.Scanner;

/*
Given an integer array Arr of size N, the task is to find the count of elements whose value is greater 
than all of its prior elements.

Note:

The first element of the array should always be included in the count.
Example 1

Input:
5   → Value of N, size of Arr  
7   → Arr[0]  
4   → Arr[1]  
8   → Arr[2]  
2   → Arr[3]  
9   → Arr[4]  

Output:
3

Explanation:
7 is the first element → counted.
8 is greater than all previous elements (7, 4) → counted.
9 is greater than all previous elements (7, 4, 8, 2) → counted.
Total count = 3.

Example 2

Input:
5   → Value of N, size of Arr  
3   → Arr[0]  
4   → Arr[1]  
5   → Arr[2]  
8   → Arr[3]  
9   → Arr[4]  

Output:
5
Explanation:
 Every element is greater than all of its prior elements.

Constraints:
1 ≤ N ≤ 20
1 ≤ Arr[i] ≤ 10000 */

public class CountOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        countElement(arr, n);
        sc.close();
    }

    static void countElement(int[] arr, int n){
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 || arr[i] > max){
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);
    }

}
