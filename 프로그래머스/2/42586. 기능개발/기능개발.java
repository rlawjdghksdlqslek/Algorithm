import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> progressQueue = new LinkedList<>();
        Queue<Integer> speedQueue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();


        for (int i = 0; i < progresses.length; i++) {
            progressQueue.offer(progresses[i]);
            speedQueue.offer(speeds[i]);
        }

        while (!progressQueue.isEmpty()) {
            
            for (int i = 0; i < progressQueue.size(); i++) {
                int progress = progressQueue.poll();
                int speed = speedQueue.poll();
                progressQueue.offer(progress + speed);
                speedQueue.offer(speed);
            }

            int count = 0;
            while (!progressQueue.isEmpty() && progressQueue.peek() >= 100) {
                progressQueue.poll();
                speedQueue.poll();
                count++;
            }

            if (count > 0) {
                answer.add(count);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}