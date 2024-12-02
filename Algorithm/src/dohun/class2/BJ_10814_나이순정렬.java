package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ_10814_나이순정렬 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try {

            int n = Integer.parseInt(br.readLine());
            String[][] arr = new String[n][2];

            for(int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i][0] = st.nextToken();
                arr[i][1] = st.nextToken();
            }

            Arrays.sort(arr, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

            for(String[] arr1 : arr) {
                System.out.println(arr1[0] + " " + arr1[1]);
            }

        } catch (Exception ignored) {}
    }
}
