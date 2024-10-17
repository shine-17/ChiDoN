package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_4153_직각삼각형 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        try {

            while(true) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                if(a+b+c == 0) break;

                list.clear();
                list.add(a);
                list.add(b);
                list.add(c);
                Collections.sort(list);

                if(Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(list.get(2), 2)) {
                    sb.append("right").append("\n");
                }
                else {
                    sb.append("wrong").append("\n");
                }
            }

            System.out.println(sb);

        } catch(Exception ignored) {}
    }
}
