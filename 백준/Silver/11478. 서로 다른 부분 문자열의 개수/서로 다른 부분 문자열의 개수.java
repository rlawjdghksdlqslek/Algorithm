import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                set.add(input.substring(i, j + 1));
            }
        }

        System.out.println(set.size());
        br.close();
    }

}