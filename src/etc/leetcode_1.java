package etc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    // time complexity : for loop -> O(n)
    // space complexity : HashMap to push number of 'int[] nums' -> O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }

        return new int[]{};
    }
}
public class leetcode_1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        //System.out.println(Arrays.toString(s.twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(s.twoSum(new int[]{3,2,3}, 6)));
    }
}
