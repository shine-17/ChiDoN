package byeongyeong.week_5rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 5주차 과제 : 10989(수 정렬하기 3), 11050(이항 계수 1), 28702(FizzBuzz)
 *
 * 10989, 수 정렬하기 3
 * 출처: https://www.acmicpc.net/problem/10989
 *
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 *
 * 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
 *
 * 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 * @author byeongyeong, Lim
 */
public class BJ_10989 {

    public static void main(String[] args) throws IOException {
        // 수의 범위 (0 ~ 10000) 사실상 0은 제외
        int[] cnt = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가
            cnt[Integer.parseInt(br.readLine())] ++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i = 1; i < 10001; i++){
            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
