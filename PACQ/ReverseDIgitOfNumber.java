public class ReverseDIgitOfNumber {

    public static void main(String[] args) {
        int num = -12345;
        int rev = 0;

        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        rev *= sign;

        System.out.println("Reversed Number: " + rev);
    }
    
}
