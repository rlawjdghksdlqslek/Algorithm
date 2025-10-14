import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine().trim());
        
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().trim().split(" ");
            int[] arr = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                arr[j] = Integer.parseInt(input[j]);
            }
            
            int max = arr[0];
            int min = arr[0];
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > max) max = arr[j];
                if (arr[j] < min) min = arr[j];
            }
            
            int a = max, b = min;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int gcd = a;
            
            int lcm = (max * min) / gcd;
            
            System.out.println(lcm);
        }
        
        br.close();
    }
}