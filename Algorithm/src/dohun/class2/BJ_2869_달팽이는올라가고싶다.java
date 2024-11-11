package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2869_달팽이는올라가고싶다 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            int day = (v - a) / (a - b);

            if(day < 1) {
                day = 1;
            }
            else {
                day = (v - a) % (a - b) == 0 ? (v - a) / (a - b) : (v - a) / (a - b) + 1;
            }

            day++;

            System.out.println(day);

        } catch(Exception ignored) {}
    }
}