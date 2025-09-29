import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        int[] l = new int[n];
        input = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int currentSum = l[i] + l[j] + l[k];
                    if (sum <= currentSum && currentSum <= m) {
                        sum = currentSum;
                    }
                }
            }
        }
        
        System.out.println(sum);
        sc.close();
    }
}