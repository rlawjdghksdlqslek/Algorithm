import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String groupWord = "";
            boolean isGroupWord = true;

            for (int j = 0; j < input.length(); j++) {
                char curChar = input.charAt(j);

                if (!groupWord.contains(String.valueOf(curChar))) {
                    groupWord += curChar;
                } else if (j > 0 && curChar != input.charAt(j - 1)) {
                    isGroupWord = false;
                    break;
                }
            }

            if (isGroupWord) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}