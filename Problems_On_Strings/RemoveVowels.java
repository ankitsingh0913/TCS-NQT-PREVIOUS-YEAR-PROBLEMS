import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        for(char c : s.toCharArray()){
            if(!vowels.contains(c)){
                res+=c;
            }
        }
        System.out.println(res);
    }
}