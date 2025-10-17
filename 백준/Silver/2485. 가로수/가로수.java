import java.io.*;
import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int a = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            int num = Integer.parseInt(br.readLine());
            arr.add(num - a);
            a = num;
        }
        
        int gap = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            gap = gcd(gap, arr.get(i));
        }
        
        int result = 0;
        for (int x : arr) {
            result += (x / gap) - 1;
        }
        
        System.out.println(result);
        
        br.close();
    }
}