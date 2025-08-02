import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String target = "UCPC";

        int targetIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target.charAt(targetIndex)) {
                targetIndex++;
            }

            if (targetIndex == 4) {
                break;
            }
        }

        if (targetIndex == 4) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }

        br.close();
    }
}