import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] adj;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        adj = new ArrayList[N + 1];
        parents = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        bfs(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }

        br.close();
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int current = q.poll();

            for (int next : adj[current]) {
                if (parents[next] == 0) {
                    parents[next] = current;
                    q.add(next);
                }
            }
        }
    }
}