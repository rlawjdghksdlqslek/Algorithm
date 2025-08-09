import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            Integer value = null;
            
            if (st.hasMoreTokens()) {
                value = Integer.parseInt(st.nextToken());
            }

            switch (command) {
                case 1:
                    dq.addFirst(value);
                    break;
                case 2:
                    dq.addLast(value);
                    break;
                case 3:
                    sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append('\n');
                    break;
                case 4:
                    sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append('\n');
                    break;
                case 5:
                    sb.append(dq.size()).append('\n');
                    break;
                case 6:
                    sb.append(dq.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 7:
                    sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append('\n');
                    break;
                case 8:
                    sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append('\n');
                    break;
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}