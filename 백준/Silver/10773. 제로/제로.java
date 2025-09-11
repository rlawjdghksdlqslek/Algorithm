import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int number = scanner.nextInt();

            if (number != 0) {
                stack.push(number);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }

        System.out.println(sum);

        scanner.close();
    }
}