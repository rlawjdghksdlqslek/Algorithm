import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int tapeCount = 0;

        Set<Integer> leakLocations = new TreeSet<>();
        StringTokenizer locationSt = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            leakLocations.add(Integer.parseInt(locationSt.nextToken()));
        }

        int tapeEndLocation = -1;

        for (int currentLocation : leakLocations) {
            if (currentLocation > tapeEndLocation) {
                tapeCount++;
                tapeEndLocation = currentLocation + L - 1;
            }
        }

        System.out.println(tapeCount);

        br.close();
    }
}