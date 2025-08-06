import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        int answer = bfs(1);
        System.out.println(answer);

        br.close();
    }

    public static int bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visited = new boolean[N + 1];

        q.add(start);
        visited[start] = true;
        int count = 0;

        while (!q.isEmpty()) {
            int current = q.poll();

            if (current != start) {
                count++;
            }

            for (int i : adj[current]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return count;
    }
}