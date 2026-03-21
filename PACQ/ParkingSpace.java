
import java.util.Scanner;

/*
Problem Statement
A parking lot in a mall has R × C number of parking spaces.
 Each parking space can be:

Empty (0)
Full (1)
The status of a parking space is represented as the element of a matrix M[R][C].
The task is to find the index of the row (R) that has the maximum number of parking spaces full (1).

Note:
R × C → Size of the matrix.
Elements of the matrix should be only 0 or 1.
If multiple rows have the same maximum number of 1s, the row with the smallest index should be returned.
Example 1

Input:
3   → Value of R (rows)  
3   → Value of C (columns)  
0  
1  
0  
1  
1  
0  
1  
1  
1  

Output:
3   → Row 3 has the maximum number of 1’s

Example 2
Input:
4   → Value of R (rows)  
3   → Value of C (columns)  
0  
1  
0  
1  
1  
0  
1  
0  
1  
1  
1  
1  

Output:
4   → Row 4 has the maximum number of 1’s

Constraints:
1 ≤ R, C ≤ 100
M[i][j] ∈ {0, 1}
*/

public class ParkingSpace {

    static void findMaxFullSpaces(int[][] matrix, int r, int c){
        int maxFullSpace = -1;
        int rowIndex = -1;

        for(int i = 0;i<r;i++){
            int currentFullSpace = 0;
            for(int j = 0;j<c;j++){
                if(matrix[i][j] == 1){
                    currentFullSpace++;
                }

                if(currentFullSpace > maxFullSpace){
                    maxFullSpace = currentFullSpace;
                    rowIndex = i + 1;
                }
            }
        }

        System.out.println(rowIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        findMaxFullSpaces(matrix, r, c);
        sc.close();
    }
}