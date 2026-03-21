

/*
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
Note: You need to solve this problem without utilizing the built-in sort function.

Examples:
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Follow up: Could you come up with a one-pass algorithm using only constant extra space?

Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 2
*/

public class Sort0s1sand2s {

    public static void swap(int a[], int i, int j){
        int temp  = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr.length;

        int i = 0;
        int j = n -1;
        int mid = 0;

        while( mid <= j){
            if(arr[mid] == 0){
                swap(arr, mid, i);
                i++;mid++;
            } else if( arr[mid] == 1){
                mid++;
            } else if(arr[mid] == 2){
                swap(arr,mid,j);
                i--;
            }
        }
        System.out.println(arr);
    }
}
