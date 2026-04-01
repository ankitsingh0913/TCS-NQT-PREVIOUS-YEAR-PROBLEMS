
import java.util.Scanner;

public class MeetingDuration {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        sc.nextLine(); // consume newline

        String[] arr = sc.nextLine().split(" ");

        int count = 0;

        for (String s : arr) {
            int battery = Integer.parseInt(s);
            if (battery >= k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
