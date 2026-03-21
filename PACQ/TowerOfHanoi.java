/*
Problem Statement:
    Given an integer n representing the number of disks, calculate the minimum number of moves required to solve the Tower of Hanoi puzzle.

Input Format:
    A single integer n (number of disks).

Output Format:
    A single integer, the minimum number of moves.

Note:
    The formula to calculate the minimum moves is:
                            Moves=2n−1

Sample Cases:
Input 1:
3
Output 1:
7

Input 2:
4
Output 2:
15
*/

public class TowerOfHanoi {

    public static int calculateMoves(int n) {
        return (int) Math.pow(2, n) - 1;
    }

    public static void main(String[] args) {
        int n = 3; // Example input for number of disks
        int moves = calculateMoves(n);
        System.out.println(moves);
    }
    
}
