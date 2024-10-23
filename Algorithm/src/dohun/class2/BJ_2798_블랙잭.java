package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_2798_블랙잭 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            List<Integer> cards = new ArrayList<Integer>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()) {
                int card = Integer.parseInt(st.nextToken());
                cards.add(card);
            }

            Set<Integer> set = new TreeSet<>();
            int sum = 0;

            for(int i=0; i<cards.size()-2; i++) {
                int card1 = cards.get(i);

                for(int j=i+1; j<cards.size()-1; j++) {
                    int card2 = cards.get(j);

                    for(int k=j+1; k<cards.size(); k++) {
                        int card3 = cards.get(k);

                        sum = card1 + card2 + card3;

                        if(m >= sum) set.add(sum);
                    }
                }
            }

            System.out.println(set.stream().max(Integer::compareTo).get());

            /*

                cards 중에 3장의 카드
                3장의 카드는 m을 넘지 않는 최대한 m과 가까운 합을 만들어야함

                1. 완전탐색으로 모든 조합의 합을 구함

             */



        } catch(Exception ignored) {}
    }
}
