import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        String[] word = line.split(" +");

        int cnt = 0;
        for (String w : word) {
            if (!w.isEmpty()) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}