import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if (N == 0) {
            System.out.println(0);
            return;
        } else if (N == 1) {
            System.out.println(1);
            return;
        }

        int fibo[] = new int[N+1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < N + 1; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        System.out.println(fibo[N]);
        br.close();
    }
}