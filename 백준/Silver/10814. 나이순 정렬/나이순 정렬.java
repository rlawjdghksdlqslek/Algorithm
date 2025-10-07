import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = String.valueOf(i);
        }

        Arrays.sort(arr, (o1, o2) -> {
            int age1 = Integer.parseInt(o1[0]);
            int age2 = Integer.parseInt(o2[0]);
            if (age1 == age2) {
                return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
            }
            return age1 - age2;
        });

        StringBuilder sb = new StringBuilder();
        for (String[] s : arr) {
            sb.append(s[0] + " " + s[1] + "\n");
        }

        System.out.println(sb);

        br.close();
    }
}