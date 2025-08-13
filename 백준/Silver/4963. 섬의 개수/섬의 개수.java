import java.io.*;
import java.util.*;

public class Main {
    static int w, h;

    static int[][] adj;
    static boolean[][] visited;

    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            adj = new int[h][w];
            visited = new boolean[h][w];


            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    adj[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int answer = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (adj[i][j] == 1 && !visited[i][j]) {
                        answer++;
                        bfs(i, j);
                    }
                }
            }
            sb.append(answer).append('\n');
        }


        System.out.println(sb);
        br.close();
    }

    private static void bfs(int startX, int startY) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!q.isEmpty()) {
            int current[] = q.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                    if (adj[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
