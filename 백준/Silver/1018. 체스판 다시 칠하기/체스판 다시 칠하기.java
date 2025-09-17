import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }
        
        int minResult = 64;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {

                int count1 = 0;
                int count2 = 0;

                for (int a = i; a < i + 8; a++) {
                    for (int b = j; b < j + 8; b++) {

                        if ((a + b) % 2 == 0) {
                            if (board[a][b] != 'B') count1++;
                            if (board[a][b] != 'W') count2++;
                        }
                        else {
                            if (board[a][b] != 'W') count1++;
                            if (board[a][b] != 'B') count2++;
                        }
                    }
                }

                int currentMin = Math.min(count1, count2);

                if (currentMin < minResult) {
                    minResult = currentMin;
                }
            }
        }

        System.out.println(minResult);
    }
}