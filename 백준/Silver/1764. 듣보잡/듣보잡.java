import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N + M; i++) {
            String input = br.readLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        List<String> list = new ArrayList<>();
        int cnt = 0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                list.add(e.getKey());
                cnt ++;
            }
        }

        StringBuffer sb = new StringBuffer();
        sb.append(cnt).append("\n");

        Collections.sort(list);
        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);

    }
}