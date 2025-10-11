import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>(N);
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        TreeSet<String> result = new TreeSet<>();
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (set.contains(input)) {
                result.add(input);
            }
        }

        bw.write(result.size() + "\n");
        for (String s : result) {
            bw.write(s + "\n");
        }
        bw.flush();
    }
}