import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
        }
        int sum = 0;

        while ((pq.size() > 1)) {
            int a = pq.poll();
            int b = pq.poll();
            sum += (a + b);
            pq.add(a + b);
        }

        System.out.println(sum);
        sc.close();
    }
}
