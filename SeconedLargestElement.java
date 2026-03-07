
import java.util.Arrays;

public class SeconedLargestElement {

    public static void main(String[] args) {
        int[] arr = {5,5,5};
        int n = arr.length;
        if (n < 2) {
            System.out.println(-1);
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(int i = 0;i<n;i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println("Second Largest Element: " + max2);
        }
    }
    
}
