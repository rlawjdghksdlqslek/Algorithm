import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }

        Integer[] setArr = set.toArray(new Integer[0]);
        Arrays.sort(setArr);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < setArr.length; i++) {
            map.put(setArr[i], i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb);

        br.close();
    }
}