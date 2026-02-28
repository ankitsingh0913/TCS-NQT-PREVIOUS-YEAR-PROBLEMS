import java.util.Scanner;

public class Binary_Representation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int temp = n;
        int bits = 0;
        while (temp > 0) {
            bits++;
            temp >>= 1;
        }

        int mask = (1 << bits) - 1;

        int result = n ^ mask;

        System.out.println("The positive integer value after toggling all bits is: " + result);
    }
}