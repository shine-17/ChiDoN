package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_10989_수정렬하기3_1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int[] countArr = new int[10001];
            int[] newArr = new int[n];
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<n; i++) {
                int value = Integer.parseInt(br.readLine());
                arr[i] = value;
                countArr[value]++;
            }

            for(int i=1; i<countArr.length; i++) {
                countArr[i] += countArr[i-1];
            }

            for(int i=arr.length-1; i>=0; i--) {
                int key = --countArr[arr[i]];
                newArr[key] = arr[i];
            }

            for(Integer num : newArr) {
                sb.append(num).append("\n");
            }

            System.out.println(sb);

        } catch(Exception ignored) {}
    }
}
