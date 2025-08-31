import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() >= m) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(map.keySet());

        Collections.sort(words, (s1, s2) -> {
            int freq1 = map.get(s1);
            int freq2 = map.get(s2);
            if (freq1 != freq2) {
                return Integer.compare(freq2, freq1);
            }

            if (s1.length() != s2.length()) {
                return Integer.compare(s2.length(), s1.length());
            }

            return s1.compareTo(s2);
        });

        for (String word : words) {
            bw.write(word + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}