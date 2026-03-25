
import java.util.HashSet;

/*
You are given an m x n matrix grid of positive integers. Your task is to determine if it is possible to make either one horizontal or one vertical cut on the grid such that:

Each of the two resulting sections formed by the cut is non-empty.
The sum of the elements in both sections is equal.
Return true if such a partition exists; otherwise return false.

 

Example 1:

Input: grid = [[1,4],[2,3]]

Output: true

Explanation:



A horizontal cut between row 0 and row 1 results in two non-empty sections, each with a sum of 5. Thus, the answer is true.

Example 2:

Input: grid = [[1,3],[2,4]]

Output: false

Explanation:

No horizontal or vertical cut results in two non-empty sections with equal sums. Thus, the answer is false.

 

Constraints:

1 <= m == grid.length <= 105
1 <= n == grid[i].length <= 105
2 <= m * n <= 105
1 <= grid[i][j] <= 105
*/

class EqualSumGridPartition {
    int n, m;

    boolean checkHz(int[][] grid){
        HashSet<Long> st = new HashSet<>();

        long pref = 0;

        for(int i = 0; i < n; i++){
            long rowSum = 0;
            for(int j = 0; j < m; j++){
                rowSum += grid[i][j];
            }
            pref += rowSum;
            st.add(pref);
        }

        if(pref % 2 != 0) return false;

        return st.contains(pref / 2);
    }

    boolean checkVz(int[][] grid){
        HashSet<Long> st = new HashSet<>();

        long pref = 0;

        for(int j = 0; j < m; j++){
            long colSum = 0;
            for(int i = 0; i < n; i++){
                colSum += grid[i][j];
            }
            pref += colSum;
            st.add(pref);
        }

        if(pref % 2 != 0) return false;

        return st.contains(pref / 2);
    }

    public boolean canPartitionGrid(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        return checkHz(grid) || checkVz(grid);
    }
}