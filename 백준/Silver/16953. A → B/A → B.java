import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 1;

        while (b > a) {
            if (b % 10 == 1) {
                b = (b - 1) / 10;
            } else if (b % 2 == 0) {
                b = b / 2;
            } else {
                count = -1;
                break;
            }
            count++;
        }

        if (b != a) {
            count = -1;
        }

        System.out.println(count);
    }
}