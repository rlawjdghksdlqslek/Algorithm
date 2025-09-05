import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            list.add(k);
            sum += k;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (Integer i : list) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        int maxFrequency = Collections.max(hashMap.values());
        List<Integer> frequencyArr = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                frequencyArr.add(entry.getKey());
            }
        }

        Collections.sort(frequencyArr);

        Collections.sort(list);
        System.out.println(Math.round((double) sum / n));
        System.out.println(list.get(n / 2));
        if (frequencyArr.size() > 1) {
            System.out.println(frequencyArr.get(1));
        } else {
            System.out.println(frequencyArr.get(0));
        }
        System.out.println(list.get(list.size() - 1) - list.get(0));


        bw.flush();
        br.close();
        bw.close();
    }
}