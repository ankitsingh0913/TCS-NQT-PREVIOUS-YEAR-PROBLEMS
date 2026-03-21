/*
Problem Statement:
    Given a matrix of size m×n, your task is to:
    If m≤0 or n≤0 print: "invalid input" Otherwise, find and print the minimum value in the matrix

Input Format:
    Two integers m and n, separated by a space, representing the number of rows and columns in the matrix.
    Then m lines follow, each containing n space-separated integers, representing the matrix elements.

Output Format:
    If the matrix size is invalid, output "invalid input".
    Otherwise, output a single integer: the minimum value found in the matrix.

Sample Case 1:
Input:
    3  3
    1  2  3
    3 -3  4
   -1  2  3 
Output:
    -3
    */


public class MatrixMinimumFinder {

    static int findMinimum(int[][] matrix, int m, int n) {
        if(m<= 0 || n <= 0){
            System.out.println("invalid input");
            return Integer.MAX_VALUE; // Return a large value to indicate invalid input
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] matrix = {
            {1, 2, 3},
            {3, -3, 4},
            {-1, 2, 3}
        };

        int min = findMinimum(matrix, m, n);
        System.out.println("The minimum value in the matrix is: " + min);
    }    
}