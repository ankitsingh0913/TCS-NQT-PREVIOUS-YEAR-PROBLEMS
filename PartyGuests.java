
import java.util.Scanner;

/*
Problem Statement:
    A party has been organized on a cruise for a limited time T (in hours).
    The number of guests entering the party at each hour is given by the array E[i].
    The number of guests leaving the party at each hour is given by the array L[i].
    The task is to find the maximum number of guests present on the cruise at any given time within T hours.		

Example 1

Input:
5
7
0
5
1
3            
1
2
1
3
4

Output:
8

Explanation:
    Hour 1: 7 enter, 1 leave → Guests = 6
    Hour 2: 0 enter, 2 leave → Guests = 4
    Hour 3: 5 enter, 1 leave → Guests = 8 (max)
    Hour 4: 1 enter, 3 leave → Guests = 6
    Hour 5: 3 enter, 4 leave → Guests = 5
    Maximum guests = 8

Example 2

Input:
4
3
5
2
0          
0
2
4
4

Output:
6

Explanation:
    Hour 1: Guests = 3
    Hour 2: Guests = 6 (max)
    Hour 3: Guests = 4
    Hour 4: Guests = 0
    Maximum guests = 6

Input Format for Testing:
    First input → Value of T (positive integer)
    Second input → T integers (E[0] to E[T-1]), each on a new line
    Third input → T integers (L[0] to L[T-1]), each on a new line

Output Format for Testing:
    Output a positive integer representing the maximum number of guests at any instance.

Constraints:
    1 ≤ T ≤ 25
    0 ≤ E[i] ≤ 500
    0 ≤ L[i] ≤ 500
 */

public class PartyGuests {

    static void maxGuest(int T, int[] E, int[] L){
        int max = 0;
        int curr  = 0;
        for(int i = 0;i < T;i++){
            curr += E[i] -L[i];
            max = Math.max(max, curr);
        }
        System.out.println(max);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] E = new int[T];
        int[] L = new int[T];

        for(int i = 0;i<T;i++){
            E[i] = sc.nextInt();
        }

        for(int i = 0;i<T;i++){
            L[i] = sc.nextInt();
        }

        maxGuest(T, E, L);
    }   
}
