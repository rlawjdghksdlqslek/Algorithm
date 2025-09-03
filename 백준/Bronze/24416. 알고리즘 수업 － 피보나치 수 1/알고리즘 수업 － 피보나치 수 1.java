import java.io.*;
import java.util.*;

public class Main {

    static int cntA, cntB;
    static int[] f;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        f = new int[n + 1];
        f[1] = 1;
        f[2] = 1;
        fib(n);
        fibonacci(n);

        sb.append(cntA).append(' ').append(cntB);
        System.out.println(sb);

        br.close();
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            cntA++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibonacci(int n) {
        for (int i = 3; i <= n; i++) {
            f[n] = f[n - 1] + f[n - 2];
            cntB++;
        }
        return f[n];
    }
}