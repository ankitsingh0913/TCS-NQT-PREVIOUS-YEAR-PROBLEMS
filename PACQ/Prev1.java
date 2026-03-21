/*
 * You are given an array of integers, arr,
and an integer k. Your task is to find and print the maximum number in
each contiguous window of size k.
Sample test case 1:
Input:
arr = [1, 3, -1, -3, 5, 3, 6, 7] k=3
Output:
[3, 3, 5, 5, 6, 7]
 */

public class Prev1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int n = arr.length;
        int[] result = new int[n - k + 1];
        
        for (int i = 0; i <= n - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            result[i] = max;
        }
        
        // Print the result
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
