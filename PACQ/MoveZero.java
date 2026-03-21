import java.util.Arrays;

public class MoveZero{
    public static void main(String[] args) {
        int[] arr = {1,0,0,3,12};
        moveZero(arr);
    }

    static void moveZero(int[] arr){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
