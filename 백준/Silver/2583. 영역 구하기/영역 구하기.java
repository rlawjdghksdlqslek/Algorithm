import java.io.*;
import java.util.*;

public class Main {
    static int M, N, K;
    static int[][] adj;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        adj = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            for (int y = startY; y < endY; y++) {
                for (int x = startX; x < endX; x++) {
                    adj[y][x] = 1;
                }
            }
        }

        List<Integer> empty = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (adj[i][j] == 0 && !visited[i][j]) {
                    int areaSize = bfs(i, j);
                    empty.add(areaSize);
                }
            }
        }

        System.out.println(empty.size());
        Collections.sort(empty);
        for (int e : empty) {
            System.out.print(e + " ");
        }
    }

    static int bfs(int startY, int startX) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startY, startX});
        visited[startY][startX] = true;
        int areaSize = 1;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int y = curr[0];
            int x = curr[1];

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && adj[ny][nx] == 0 && !visited[ny][nx]) {
                    q.add(new int[]{ny, nx});
                    visited[ny][nx] = true;
                    areaSize++;
                }
            }
        }
        return areaSize;
    }
}