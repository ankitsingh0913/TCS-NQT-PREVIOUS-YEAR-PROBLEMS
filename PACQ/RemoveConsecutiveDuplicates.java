/*
Problem Statement:
    Given a sequence of digits, remove consecutive duplicate elements and retain only the first occurrence in each group.

Input:
    A string of digits.

Output:
    A string with consecutive duplicates removed.

Sample Cases:
Input 1:
    112233345

Output 1:
    12345

Input 2:
    1122331156

Output 2:
    123156
*/

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

    static String removeDuplicate(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeDuplicate(s));
    }
}
