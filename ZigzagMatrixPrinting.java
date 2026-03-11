/*
Problem Statement:
    Given a matrix of size m×n, print its elements in a zigzag row-wise pattern:
    For even numbered rows (starting from row 1), print from left to right.
    For odd numbered rows (starting from row 2), print from right to left.
Input Format:
    Two integers, m and n, separated by a space (number of rows and columns).
    Next, m lines follow with n space-separated integers, representing the matrix.
Output Format:
    Print the matrix elements in the required zigzag pattern, each row on a new line.

Sample Case:
Input:
    3 3
    1 2 3
    4 5 6
    7 8 9
Output:
    1 2 3
    6 5 4
    7 8 9
*/

public class ZigzagMatrixPrinting {

    static void zigZagMatrix(int[][] matrix, int m, int n){
        for(int i = 0;i < m; i++){
            if(i % 2 == 0){
                for(int j = 0; j < n; j++){
                    System.out.print(matrix[i][j] +(j < n-1 ? " " : "\n"));
                } 
            }else {
                for(int j = n -1; j>=0;j--){
                    System.out.print(matrix[i][j] + (j > 0 ? " " : "\n"));
                }
            }
        }
    }
    

    public static void main(String[] args) {
        int m = 3; // Example input for rows
        int n = 3; // Example input for columns
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        zigZagMatrix(matrix, m, n);
    }
}
