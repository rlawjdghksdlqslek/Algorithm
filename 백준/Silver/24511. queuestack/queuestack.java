import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] type = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            type[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> result = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (type[i] == 0) { // 큐인 경우
                result.addFirst(value);
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int inputValue = Integer.parseInt(st.nextToken());
            result.addLast(inputValue);
            sb.append(result.pollFirst()).append(" ");
        }

        System.out.println(sb.toString().trim());

        br.close();
    }
}