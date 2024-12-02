package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_7568_덩치 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try {

            int n = Integer.parseInt(br.readLine());

            List<Size> list = new ArrayList<>();
            for(int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                list.add(new Size(x,y));
            }

            List<Integer> rankList = new ArrayList<>();
            for(Size size : list) {
                int count = (int) list.stream().filter(x -> x.x > size.x && x.y > size.y).count();
                rankList.add(++count);
            }

            StringBuilder sb = new StringBuilder();
            for(Integer rank : rankList) {
                sb.append(rank).append(" ");
            }

            System.out.println(sb);


        } catch(Exception ignored) {}
    }

    static class Size {
        int x;
        int y;

        public Size(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
