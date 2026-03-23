
import java.util.HashMap;
import java.util.Scanner;

/*
Given a maximum of four digits to the base 17(10 -> A, 11 -> B, 12 -> C, 16 -> G) as
input, output its decimal value.
Input:
23GF
*/

public class SweetSeventeen{
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);
        map.put('G',16);
        map.put('a',10);
        map.put('b',11);
        map.put('c',12);
        map.put('d',13);
        map.put('e',14);
        map.put('f',15);
        map.put('g',16);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long num = 0;
        int k = 0;

        for(int i = s.length()-1; i >= 0;i--){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
                num += map.get(s.charAt(i))*(int)Math.pow(17,k++);
            } else {
                num += ((s.charAt(i)-'0') * (int)Math.pow(17,k++));
            }
        }
        System.out.println(num);
    }
}