import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        
        System.out.println(lcm(a, b));
    }
    
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static long lcm(long a, long b) {
        return Math.abs(a * b / gcd(a, b));
    }
}