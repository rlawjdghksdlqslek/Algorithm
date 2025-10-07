import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        List<Character> list = new ArrayList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        Collections.sort(list, Collections.reverseOrder());

        String output = "";

        for (Character c : list) {
            output+= c;
        }

        System.out.println(output);
        br.close();
    }
}