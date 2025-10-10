import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());
        
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();

            if (log.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : set) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);

        br.close();
    }
}