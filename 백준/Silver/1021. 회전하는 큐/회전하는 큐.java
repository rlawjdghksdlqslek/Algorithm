import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            int targetIdx = deque.indexOf(target);

            int halfSize = deque.size() / 2;

            if (targetIdx <= halfSize) {
                for (int j = 0; j < targetIdx; j++) {
                    deque.addLast(deque.pollFirst());
                    cnt++;
                }
            }
            else {
                for (int j = 0; j < deque.size() - targetIdx; j++) {
                    deque.addFirst(deque.pollLast());
                    cnt++;
                }
            }

            deque.pollFirst();
        }

        System.out.println(cnt);
    }
}