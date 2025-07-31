import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int answer = 0;

        Map<Integer, Boolean> tapeMap = new TreeMap<>();
        StringTokenizer locationSt = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            tapeMap.put(Integer.parseInt(locationSt.nextToken()), false);
        }

        int tapeEndLocation = 0;

        for (Map.Entry<Integer, Boolean> entry : tapeMap.entrySet()) {
            int currentLocation = entry.getKey();

            if (currentLocation > tapeEndLocation) {
                answer++;
                tapeEndLocation = currentLocation + L - 1;
            }
        }

        System.out.println(answer);
        br.close();
    }
}