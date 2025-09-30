import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= n; i++) {
            String numStr = String.valueOf(i);
            int sum = i;
            for (char c : numStr.toCharArray()) {
                sum += Character.getNumericValue(c);
            }
            
            if (sum == n) {
                System.out.println(i);
                br.close();
                return;
            }
            
            if (i == n) {
                System.out.println(0);
            }
        }
        
        br.close();
    }
}