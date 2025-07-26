import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Integer[] A = new Integer[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        int answer = 0;

        for (int i = 0; i < N; i++) {
            if (answer <= A[i] * (N - i)) {
                answer = A[i] * (N - i);
            }
        }
        System.out.println(answer);

        sc.close();
    }
}