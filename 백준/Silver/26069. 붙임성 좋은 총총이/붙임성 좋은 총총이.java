import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        HashSet<String> dancing = new HashSet<>();
        dancing.add("ChongChong"); 
        
        for (int i = 0; i < N; i++) {
            String[] names = br.readLine().split(" ");
            String person1 = names[0];
            String person2 = names[1];
            
            if (dancing.contains(person1) || dancing.contains(person2)) {
                dancing.add(person1);
                dancing.add(person2);
            }
        }
        
        System.out.println(dancing.size());
    }
}