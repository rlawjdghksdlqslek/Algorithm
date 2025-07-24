import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");
        String strA = st.nextToken();
        String strB = st.nextToken();

        String minStrA = strA.replace('6', '5');
        String minStrB = strB.replace('6', '5');

        String maxStrA = strA.replace('5', '6');
        String maxStrB = strB.replace('5', '6');

        int minSum = Integer.parseInt(minStrA) + Integer.parseInt(minStrB);
        int maxSum = Integer.parseInt(maxStrA) + Integer.parseInt(maxStrB);

        System.out.println(minSum + " " + maxSum);

        br.close();

    }
}
