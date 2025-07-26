import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        if (input.length() > 0) {
            sb.append(input.charAt(0));
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) != input.charAt(i - 1)) {
                    sb.append(input.charAt(i));
                }
            }
        }

        int oneCount = 0;
        int zeroCount = 0;

        String changeInput = sb.toString();
        for (char c : changeInput.toCharArray()) {
            if (c == '1') {
                oneCount++;
            } else if (c == '0') {
                zeroCount++;
            }
        }

        System.out.println(Math.min(oneCount,zeroCount));
    }
}