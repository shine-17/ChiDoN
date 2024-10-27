package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_1546_평균 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            double max = 0;
            List<Double> gradeList = new ArrayList<>();

            while(st.hasMoreTokens()) {
                double grade = Integer.parseInt(st.nextToken());
                gradeList.add(grade);

                if(grade > max) max = (int) grade;
            }

            double sum = 0;
            for(Double grade : gradeList) {
                sum += grade / max * 100;
            }

            System.out.println(sum / n);

        } catch(Exception ignored) {}
    }
}
