import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i : arr){
            q.add(i);
        }
        
        int next = -1;
        
        while(!q.isEmpty()){
            int current = q.poll();
            
            if(current != next){
                list.add(current);
                next = current;
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}