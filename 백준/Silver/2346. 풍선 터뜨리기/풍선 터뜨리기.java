import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<int[]> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            dq.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        int[] current = dq.pollFirst();
        sb.append(current[0]).append(" ");
        int move = current[1];

        while (!dq.isEmpty()) {
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    dq.addLast(dq.pollFirst());
                }
                current = dq.pollFirst();
            } else {
                for (int i = 0; i < Math.abs(move) - 1; i++) {
                    dq.addFirst(dq.pollLast());
                }
                current = dq.pollLast();
            }
            sb.append(current[0]).append(" ");
            move = current[1];
        }

        System.out.println(sb);
    }
}