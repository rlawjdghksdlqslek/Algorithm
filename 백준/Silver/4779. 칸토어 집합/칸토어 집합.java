import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while ((str = br.readLine()) != null) {
            int N = Integer.parseInt(str);
            sb = new StringBuilder();
            int size = (int) Math.pow(3, N);
            for (int i = 0; i < size; i++) {
                sb.append("-");
            }
            func(0, size);
            System.out.println(sb);

        }
        br.close();
    }

    private static void func(int start, int size) {
        if (size == 1) {
            return;
        }
        int divide = size / 3;
        for (int i = start + divide; i < start + 2 * divide; i++) {
            sb.setCharAt(i, ' ');
        }
        func(start, divide);
        func(start + 2 * divide, divide);
    }
}