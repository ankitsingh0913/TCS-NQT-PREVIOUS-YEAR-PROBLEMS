
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Problem Statement
At a fun fair, a street vendor is selling balloons of different colours. He sells N balloons, each having 
a colour represented by a character in the array B[].
The task is to find the colour of the balloon which appears an odd number of times in the bunch.

Rules: If more than one colour appears an odd number of times, output the first such colour in the array.
Colours can be in upper case or lower case.
If all colours appear an even number of times, print "All are even".

Example 1

Input:
7 -> NUmber of balloons
r
g
b
b
g
y
y

Output:
r

Explanation:
 From the array [r, g, b, b, g, y, y]:

r: 1 balloon (odd)
g: 2 balloons (even)
b: 2 balloons (even)
y: 2 balloons (even)
Only r occurs an odd number of times → Output: r.

Example 2

Input:
10 -> Number of balloons
a
b
b
b
c
c
c
a
f
c

Output:
b

Explanation:
 From the array [a, b, b, b, c, c, c, a, f, c]:
  
a: 2 balloons (even)
b: 3 balloons (odd)
c: 4 balloons (even)
f: 1 balloon (odd)
Both b and f are odd in count, but b appears first → Output: b.

Input Format for Testing:

First input → Positive integer N (number of balloons)
Second input → N characters (B[0] to B[N-1]), each on a new line

Output Format for Testing:
Output should be a single character (the colour) or the message "All are even".

Constraints:

3 ≤ N ≤ 50
B[i] ∈ {a-z} or {A-Z}
 */

public class ColourOfBalloons {

    static String findOddBalloon(char[] B) {

        Map<Character, Integer> count = new HashMap<>();
        for(char balloon : B){
            count.put(balloon, count.getOrDefault(balloon,0) + 1);
        }

        for(char balloon : B){
            if(count.get(balloon) % 2 != 0){
                return String.valueOf(balloon);
            }
        }
        
        return "All are even";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] B = new char[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.next().charAt(0);
        }
        String result = findOddBalloon(B);
        System.out.println("Balloon" + result);
    }
}
