import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input1 = br.readLine().split(" ");
        int[] arr1 = new int[2];
        arr1[0] = Integer.parseInt(input1[0]);
        arr1[1] = Integer.parseInt(input1[1]);
        
        String[] input2 = br.readLine().split(" ");
        int[] arr2 = new int[2];
        arr2[0] = Integer.parseInt(input2[0]);
        arr2[1] = Integer.parseInt(input2[1]);
        
        int a = (arr2[1] * arr1[0]) + (arr1[1] * arr2[0]);
        int b = arr1[1] * arr2[1];
        
        int c = gcd(Math.max(a, b), Math.min(a, b));
        
        System.out.println((a / c) + " " + (b / c));
        
        br.close();
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}