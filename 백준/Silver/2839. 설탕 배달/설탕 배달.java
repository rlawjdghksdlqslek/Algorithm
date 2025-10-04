import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int a = 0;
        while (n >= 0) {
            if (n % 5 == 0) {
                a += (n / 5);
                System.out.println(a);
                break;
            }
            n -= 3;
            a += 1;
        }
        if (n < 0) {
            System.out.println(-1);
        }
        
        br.close();
    }
}