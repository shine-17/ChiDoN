package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1181_단어정렬 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            TreeSet<String> set = new TreeSet<>();

            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                set.add(br.readLine());
            }

            set.stream().sorted((o1, o2) -> {
                if (o1.length() == o2.length()) return o1.compareTo(o2);

                return o1.length() - o2.length();
            }).forEach(System.out::println);

        } catch(Exception ignored) {}
    }
}
