import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[][] test = new int[N][2];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                test[i][0] = Integer.parseInt(st.nextToken());
                test[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(test, (o1, o2) -> o1[0] - o2[0]);
            int sum = 1;
            int interviewRank = test[0][1];

            for (int i = 1; i < N; i++) {
                if (test[i][1] < interviewRank) {
                    sum++;
                    interviewRank = test[i][1];
                }
            }
            sb.append(sum).append('\n');
        }

        System.out.println(sb.toString());
        br.close();
    }
}
