/*
 * Problem Statement:
Given a grid of size m*n, let us assume you are starting at (1, 1) and your goal is to reach (m, n).
At any instance, if you are on (x, y), you can either go to (x, y + 1) or (x + 1, y).
Now consider if some obstacles are added to the grids.
How many unique paths would there be? An obstacle and space are marked as 1 and 0 respectively in the grid.
sample test case n=3,m= 3
arr = [
[0 0 0],
[0 1 0],
[0 0 0]
]
output: 2
 */
public class Prev2{
    public static void main(String[] args) {
        int[][] maze = {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };
        int m = 3;
        int n = 3;
        int ways = findways(maze, m, n);
        System.out.println(ways);
    }

    static int findways(int[][] maze , int m , int n){
        return findWaysRecursive(maze, 0, 0, m, n);
    }

    static int findWaysRecursive(int[][] maze, int x, int y, int m, int n) {
        // Base case: If we have reached the destination
        if (x == m - 1 && y == n - 1) {
            return 1;
        }
        // If we are out of bounds or on an obstacle, return 0
        if (x >= m || y >= n || maze[x][y] == 1) {
            return 0;
        }
        // Move right and down recursively
        return findWaysRecursive(maze, x, y + 1, m, n) + findWaysRecursive(maze, x + 1, y, m, n);
    }
}