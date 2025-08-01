import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] answer = new int[N];


        for (int i = 1; i <= N; i++) {
            int leftCount = arr[i - 1];
            int emptyCount = 0;

            for (int j = 0; j < N; j++) {
                if (answer[j] == 0) {
                    if (emptyCount == leftCount) {
                        answer[j] = i;
                        break;
                    }
                    emptyCount++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb.toString().trim());

        br.close();
    }
}