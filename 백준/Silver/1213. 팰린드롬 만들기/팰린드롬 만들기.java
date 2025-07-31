import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        Map<Character, Integer> charCount = new TreeMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        char charCenter = ' ';

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            Integer count = entry.getValue();
            if (count % 2 != 0) {
                oddCount++;
                charCenter = entry.getKey();
            }

            for (int i = 0; i < count / 2; i++) {
                sb.append(entry.getKey());
            }
        }

        if (oddCount >= 2) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        String half = sb.toString();

        if (charCenter != ' ') {
            sb.append(charCenter);
        }

        sb.append(new StringBuilder(half).reverse().toString());

        System.out.println(sb);

    }
}