import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] distance = new int[N];
        int[] price = new int[N];


        StringTokenizer distanceSt = new StringTokenizer(br.readLine(), " ");
        StringTokenizer priceSt = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(distanceSt.nextToken());
        }

        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(priceSt.nextToken());
        }

        int answer = distance[0] * price[0];
        for (int i = 1; i < N; i++) {
            if (price[i] <= price[i-1]) {
                answer += (distance[i] * price[i]);
            } else {
                answer += (distance[i] * price[i-1]);
            }
        }

        System.out.println(answer);

        br.close();
    }
}
