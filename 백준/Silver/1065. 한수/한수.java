import java.io.*;

public class Main {
    public static boolean isHansu(int num) {
        int hundred = num / 100;
        int ten = (num / 10) % 10;
        int one = num % 10;

        if ((ten - hundred) == (one - ten)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        if (N < 100) {
            count = N;
        } else {
            count = 99;

            for (int i = 100; i <= N; i++) {
                if (isHansu(i)) {
                    count++;
                }
            }
        }

        System.out.println(count);
        br.close();
    }
}