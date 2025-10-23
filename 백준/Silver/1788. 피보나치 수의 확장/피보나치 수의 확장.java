import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int MOD = 1_000_000_000;
        int N = Integer.parseInt(br.readLine());

        if (N > 0) {
            sb.append(1).append("\n");
        } else if (N < 0) {
            N = -N;
            if (N % 2 == 0) {
                sb.append(-1).append("\n");
            } else {
                sb.append(1).append("\n");
            }
        } else {
            sb.append(0).append("\n");
            sb.append(0);
            System.out.println(sb);
            return;
        }

        int[] dp = new int[N + 1];
        dp[0] = 0;
        if (N >= 1) {
            dp[1] = 1;
        }
        if (N >= 2) {
            dp[2] = 1;
        }
        for (int i = 3; i < N + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        sb.append(dp[N]);
        System.out.println(sb);
    }
}
