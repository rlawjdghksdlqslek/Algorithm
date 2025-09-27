import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        long cnt = (V - A) / (A - B);

        if ((V - A) % (A - B) != 0) {
            cnt++;
        }

        cnt++;
        
        System.out.println(cnt);

        br.close();
    }
}