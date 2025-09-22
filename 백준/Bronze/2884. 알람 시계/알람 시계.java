import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int T = 45;

        if (M - T < 0){
            H -= 1;
            M += 60;
            if (H < 0){
                H += 24;
            }
        }

        System.out.println(H + " " + (M - T));

        br.close();
    }
}
