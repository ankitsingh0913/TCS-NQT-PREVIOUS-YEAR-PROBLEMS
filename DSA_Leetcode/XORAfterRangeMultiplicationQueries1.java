package DSA_Leetcode;

public class XORAfterRangeMultiplicationQueries1 {

    static public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] a : queries){
            int x = a[0];
            while(x <= a[1]){
                nums[x] = (nums[x] * a[3]) % 100000007;
                x+=a[2];
            }
        }
        int res = 0;
        for( int i : nums){
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int[][] queries = {{0, 2, 2}, {1, 3, 3}, {0, 4, 1}};
    
            int result = xorAfterQueries(arr, queries);
            System.out.println(result);
    }
}
