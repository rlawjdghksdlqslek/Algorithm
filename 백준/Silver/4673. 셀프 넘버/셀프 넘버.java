import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int result = method(i);

            if (result <= 10000) {
                arr[result] = true;
            }
        }

        for (int i = 1; i < 10000; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }

    }
    
    public static int method(int num) {
        int sum = num;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}