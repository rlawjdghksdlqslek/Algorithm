import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] chars = input.toCharArray();

        for (int d = 0; d <= 9; d++) {
            int totalSum = 0;

            for (int i = 0; i < 13; i++) {
                int digit;

                if (chars[i] == '*') {
                    digit = d;
                } else {
                    digit = chars[i] - '0';
                }

                if ((i + 1) % 2 != 0) {
                    totalSum += digit;
                } else {
                    totalSum += digit * 3;
                }
            }

            if (totalSum % 10 == 0) {
                System.out.println(d);
                return;
            }
        }
    }
}
