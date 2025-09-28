import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int a = 1;
        int b = 1;
        
        while (n > a) {
            a += 6 * b;
            b++;
        }
        
        System.out.println(b);
        
        br.close();
    }
}