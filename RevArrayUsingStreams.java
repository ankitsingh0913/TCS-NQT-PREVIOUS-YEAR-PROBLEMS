
import java.util.stream.IntStream;

public class RevArrayUsingStreams {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] newArr = IntStream.range(0,arr.length)
            .map(i -> arr[arr.length-i-1])
            .toArray();
        System.out.println("Reversed Array: " + java.util.Arrays.toString(newArr));
    }
}