package etc;

import java.util.Collections;
import java.util.HashMap;

class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; ++i)
        {
            int value = hm.get(nums[i]) == null ? 1 : hm.get(nums[i])+1;
            hm.put(nums[i], value);
        }

        return Collections.max(hm.values()) > 1;

    }
}

public class leetcode_217 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(s.containsDuplicate(new int[]{1,2,3,4}));
    }
}
