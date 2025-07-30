import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        StringBuilder sb = new StringBuilder();

        Integer[] arr = new Integer[N.length()];
        for (int i = 0; i < N.length(); i++) {
            arr[i] = Character.getNumericValue(N.charAt(i));
        }

        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        int sum = 0;
        boolean hasZero = false;
        for (int i = 0; i < N.length(); i++) {
            if (arr[i] == 0) {
                hasZero =  true;
            }
            sum += arr[i];
        }

        if (!hasZero || sum % 3 != 0) {
            System.out.println(-1);
        } else{
            for (int i = 0; i < N.length(); i++) {
                sb.append(arr[i]);
            }
            System.out.println(sb.toString());
        }
        br.close();
    }
}
