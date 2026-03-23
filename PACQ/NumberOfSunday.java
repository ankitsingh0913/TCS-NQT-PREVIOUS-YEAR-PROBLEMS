/*
Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to
cycling with his friends.
So every time when the months starts he counts the number of sundays he will get to enjoy.
Considering the month can start with any day, be it Sunday, Monday…. Or so on.
Count the number of Sunday jack will get within n number of days.
Example 1:
Input
mon-> input String denoting the start of the month.
13 -> input integer denoting the number of days from the start of the month.
Output :
2 -> number of days within 13 days
*/
import java.util.Scanner;
public class NumberOfSunday {

    public static void main(String[] args) {
        String[] days = {"mon","tue","wed","thus","fri","sat","sun"}; 
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int n = sc.nextInt();
        int i = 0;
        for(i = 0;i<days.length;i++){
            if(days[i].equals(day)) break;
        }
        if (i == days.length) {
            System.out.println("Invalid day");
            return;
        }

        int res = 1;

        // Days left to first Sunday
        int daysToSunday = 6 - i;

        if (n > daysToSunday) {
            res = 1; // first Sunday
            n = n - daysToSunday;
            res += n / 7;
        }

        System.out.println(res);
    }
}
