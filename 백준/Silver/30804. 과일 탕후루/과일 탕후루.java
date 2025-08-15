import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] fruits = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int maxLength = 0;
        int[] fruitCounts = new int[10];
        int distinctCount = 0;

        for (int right = 0; right < N; right++) {
            int currentFruit = fruits[right];
            if (fruitCounts[currentFruit] == 0) {
                distinctCount++;
            }
            fruitCounts[currentFruit]++;

            while (distinctCount > 2) {
                int leftFruit = fruits[left];
                fruitCounts[leftFruit]--;
                
                if (fruitCounts[leftFruit] == 0) {
                    distinctCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
        br.close();
    }
}