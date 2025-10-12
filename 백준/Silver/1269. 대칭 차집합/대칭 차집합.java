import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;

        HashSet<String> aSet = new HashSet<>(N);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            aSet.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        HashSet<String> bSet = new HashSet<>(M);
        for (int i = 0; i < M; i++) {
            bSet.add(st.nextToken());
        }

        for (String s : aSet) {
            if (!bSet.contains(s)) {
                cnt++;
            }
        }

        for (String s : bSet) {
            if (!aSet.contains(s)) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}