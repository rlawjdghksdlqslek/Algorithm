import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();


        StringTokenizer st = new StringTokenizer(input, "-");
        int answer = 0;
        boolean isFirst = true;

        while (st.hasMoreTokens()) {
            String nextToken = st.nextToken();

            int sumOfPlus = plusString(nextToken);

            if (isFirst) {
                answer += sumOfPlus;
                isFirst = false;
            } else {
                answer -= sumOfPlus;
            }
        }
        System.out.println(answer);
    }

    private static int plusString(String nextToken) {
        StringTokenizer st = new StringTokenizer(nextToken, "+");
        int result = 0;
        while (st.hasMoreTokens()) {
            result += Integer.parseInt(st.nextToken());
        }
        return result;
    }
}