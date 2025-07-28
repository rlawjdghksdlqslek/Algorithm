import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] distance = new int[N - 1];
        int[] price = new int[N];


        StringTokenizer distanceSt = new StringTokenizer(br.readLine(), " ");
        StringTokenizer priceSt = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(distanceSt.nextToken());
        }

        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(priceSt.nextToken());
        }

        long answer = 0;
        long minPrice = price[0];

        for (int i = 0; i < N - 1; i++) {
            if (price[i] <= minPrice) {
                minPrice = price[i];
            }
            answer += distance[i] * minPrice;
        }

        System.out.println(answer);

        br.close();
    }
}
