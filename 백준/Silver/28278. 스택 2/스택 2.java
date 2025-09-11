import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        while (n-- != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            if (input == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (input == 2) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (input == 3) {
                sb.append(stack.size()).append("\n");
            } else if (input == 4) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (input == 5) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }

        System.out.print(sb);

        br.close();
    }
}
