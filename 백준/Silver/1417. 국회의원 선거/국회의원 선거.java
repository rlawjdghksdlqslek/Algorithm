import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(0);
            return;
        }

        int dasomVotes = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> otherCandidates = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N - 1; i++) {
            otherCandidates.add(Integer.parseInt(br.readLine()));
        }

        int buyCount = 0;

        while (dasomVotes <= otherCandidates.peek()) {
            int maxVotes = otherCandidates.poll();
            
            dasomVotes++;
            maxVotes--;
            buyCount++;
            
            otherCandidates.add(maxVotes);
        }

        System.out.println(buyCount);
        br.close();
    }
}