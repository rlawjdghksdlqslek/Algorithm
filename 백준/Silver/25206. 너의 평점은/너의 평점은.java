import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] grades = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] scores = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        double total = 0; 
        double sum = 0;  

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            double credit = Double.parseDouble(input[1]);
            String grade = input[2];

            int gradeIndex = -1;
            for (int j = 0; j < grades.length; j++) {
                if (grades[j].equals(grade)) {
                    gradeIndex = j;
                    break;
                }
            }

            if (grade.equals("P")) {
                continue;
            }

            total += credit;
            sum += credit * scores[gradeIndex];
        }

        
        double answer = sum / total;

        System.out.printf("%.6f\n", answer);

        br.close();
    }
}