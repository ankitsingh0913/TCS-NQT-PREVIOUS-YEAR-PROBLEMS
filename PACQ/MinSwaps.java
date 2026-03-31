
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
  Given two arrays, A and B, of the same length containing the same unique elements in different orders, 
  find the minimum number of swaps needed to make A identical to B.
*/

public class MinSwaps {

    static public int countNoOfSwaps(int[] A, int[] B){
        int n = A.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(B[i], i);
        }
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for(int i = 0;i<n;i++){
            if(visited[i] || map.get(A[i]) == i){
                continue;
            }
            int cycle_size = 0;
            int j = i;
            while(!visited[j]){
                visited[j] = true;
                j = map.get(A[j]);
                cycle_size++;
            }
            if(cycle_size > 0){
                swaps += (cycle_size -1);
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for(int i = 0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            B[i] = sc.nextInt();
        }

        int count = countNoOfSwaps(A, B);
        System.out.println(count);
    }
    
}
