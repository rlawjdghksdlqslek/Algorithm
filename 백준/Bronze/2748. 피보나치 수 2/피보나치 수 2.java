import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long prev2 = 0, prev1 = 1;
        for (int i = 2; i <= N; i++) {
            long curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        System.out.println(prev1);

        br.close();
    }
}