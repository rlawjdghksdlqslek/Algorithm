import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        char[] arr = input.toCharArray();

        int cntX = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'X') {
                cntX++;
            } else {
                if (cntX % 2 != 0) {
                    System.out.println("-1");
                    return;
                }
                while (cntX >= 4) {
                    sb.append("AAAA");
                    cntX -= 4;
                }

                while (cntX >= 2) {
                    sb.append("BB");
                    cntX -= 2;
                }

                sb.append(".");
            }
        }

        if (cntX > 0) {
            if (cntX % 2 != 0) {
                System.out.println("-1");
                return;
            }
            while (cntX >= 4) {
                sb.append("AAAA");
                cntX -= 4;
            }
            while (cntX >= 2) {
                sb.append("BB");
                cntX -= 2;
            }
        }

        System.out.println(sb.toString());
        br.close();
    }
}