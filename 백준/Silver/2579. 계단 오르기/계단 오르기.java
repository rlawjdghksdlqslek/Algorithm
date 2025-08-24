import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[] stairs = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[N + 1];

        dp[1] = stairs[1];
        if (N >= 2) {
            dp[2] = stairs[1] + stairs[2];
        }
        if (N >= 3) {
            dp[3] = Math.max(stairs[1], stairs[2]) + stairs[3];
        }

        for (int i = 4; i <= N; i++) {
            dp[i] = Math.max(dp[i - 3] + stairs[i - 1], dp[i - 2]) + stairs[i];
        }

        System.out.println(dp[N]);
        br.close();
    }
}