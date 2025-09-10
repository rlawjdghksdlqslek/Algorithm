import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
            pq.offer(priorities[i]);
        }
        
        int answer = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentPriority = current[0];
            int currentIndex = current[1];
            
            if (currentPriority == pq.peek()) {
                pq.poll();
                answer++;
                
                if (currentIndex == location) {
                    return answer;
                }
            } else {
                queue.offer(current);
            }
        }
        
        return answer;
    }
}