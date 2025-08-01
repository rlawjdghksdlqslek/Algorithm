import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String replaced = input.replace("XXXX", "AAAA");

        replaced = replaced.replace("XX", "BB");

        if (replaced.contains("X")) {
            System.out.println("-1");
        } else {
            System.out.println(replaced);
        }
        
        br.close();
    }
}