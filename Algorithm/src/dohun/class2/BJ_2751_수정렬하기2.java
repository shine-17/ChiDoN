package dohun.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BJ_2751_수정렬하기2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            List<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                list.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(list);

            StringBuilder sb = new StringBuilder();
            for(Integer num : list) {
                sb.append(num).append("\n");
            }

            System.out.println(sb);

        } catch(Exception ignored) {}
    }
}
