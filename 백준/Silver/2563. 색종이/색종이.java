import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] array = new int[100][100];
        
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            
            for (int i = x1; i < x1 + 10; i++) {
                for (int j = y1; j < y1 + 10; j++) {
                    array[i][j] = 1;
                }
            }
        }
        
        int result = 0;
        for (int k = 0; k < 100; k++) {
            for (int l = 0; l < 100; l++) {
                if (array[k][l] == 1) {
                    result++;
                }
            }
        }
        
        System.out.println(result);
        
        br.close();
    }
}