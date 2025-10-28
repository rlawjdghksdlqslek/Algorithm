import java.io.*;
import java.util.*;

public class Main {

    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        int[] arr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int target = arr[i];
            int index = 0;
            Iterator<Integer> it = deque.iterator();
            while (it.hasNext()) {
                if (it.next() == target) break;
                index++;
            }

            int left = index;
            int right = deque.size() - index;

            if (left <= right) {
                for (int j = 0; j < left; j++) fun2(deque);
            } else {
                for (int j = 0; j < right; j++) fun3(deque);
            }

            fun1(deque);  // 제거
        }

        System.out.println(cnt);
        br.close();
    }

    private static void fun1(Deque<Integer> deque) {
        deque.pollFirst();
    }

    private static void fun2(Deque<Integer> deque) {
        deque.addLast(deque.pollFirst());
        cnt++;
    }

    private static void fun3(Deque<Integer> deque) {
        deque.addFirst(deque.pollLast());
        cnt++;
    }

}