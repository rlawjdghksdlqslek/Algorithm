import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> list = new HashSet<>();
        
        for (int num : nums) {
            list.add(num);
        }

        return Math.min(list.size(), nums.length / 2);
    }
}
