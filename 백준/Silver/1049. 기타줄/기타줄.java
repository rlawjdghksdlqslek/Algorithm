import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int pack = Integer.MAX_VALUE;
        int piece = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            pack = Math.min(pack, Integer.parseInt(st.nextToken()));
            piece = Math.min(piece, Integer.parseInt(st.nextToken()));
        }

        int answer = 0;
        if (piece * 6 <= pack)
            answer = piece * N;
        else {
            answer = (N / 6) * pack;
            if (N % 6 * piece <= pack)
                answer += (N % 6) * piece;
            else
                answer += pack;
        }
        bw.write(answer + "");
        bw.flush();	
        bw.close();
        br.close();
    }
}
