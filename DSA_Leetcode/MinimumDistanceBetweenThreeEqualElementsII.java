package DSA_Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MinimumDistanceBetweenThreeEqualElementsII {

    public int minimumDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n= nums.length;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.computeIfAbsent(nums[i],k -> new ArrayList()).add(i);
        }

        for(List<Integer> indices : map.values()){
            if(indices.size() < 3) continue;
            for(int i = 0;i+2 < indices.size();i++){
                int dist = 2 * (indices.get(i+2) - indices.get(i));
                min = Math.min(min,dist);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        MinimumDistanceBetweenThreeEqualElementsII solution = new MinimumDistanceBetweenThreeEqualElementsII();
        int[] nums = {1, 2, 3, 1, 2, 3, 1};
        int result = solution.minimumDistance(nums);
        System.out.println(result); // Output: 4
    }
}