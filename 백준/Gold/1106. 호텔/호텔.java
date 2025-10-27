import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[C + 101];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;


        for (int[] city : arr) {
            int cost = city[0];
            int people = city[1];
            for (int j = people; j <= C + 100; j++) {
                if (dp[j - people] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - people] + cost);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = C; i <= C + 100; i++) {
            if (dp[i] != Integer.MAX_VALUE) {
                min = Math.min(min, dp[i]);
            }
        }

        System.out.println(min);
        br.close();
    }
}