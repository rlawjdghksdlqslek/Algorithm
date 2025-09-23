import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int cnt = 0;
        int i = 0;

        while (i < input.length()) {
            boolean isCroatia = false;

            for (String c : arr) {
                if (i + c.length() <= input.length() && input.startsWith(c, i)) {
                    cnt++;
                    i += c.length();
                    isCroatia = true;
                    break;
                }
            }

            if (!isCroatia) {
                cnt++;
                i++;
            }
        }

        System.out.println(cnt);


    }
}