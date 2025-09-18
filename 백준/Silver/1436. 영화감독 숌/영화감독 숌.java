import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int num = 666;

        while (true) {
            if (contains666(num)) {
                count++;
                if (count == N) {
                    System.out.println(num);
                    break;
                }
            }
            num++;
        }
    }

    private static boolean contains666(int num) {
        String str = String.valueOf(num);
        return str.contains("666");
    }
}