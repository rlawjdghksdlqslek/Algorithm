import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int change = 1000 - n;
        int answer = 0;

        int[] coins = {500, 100, 50, 10, 5, 1};
        for (int i : coins) {
            answer += change / i;
            change %= i;
            if (change == 0) {
                break;
            }
        }

        System.out.println(answer);

        br.close();
    }

}