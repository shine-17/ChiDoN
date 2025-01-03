package byeongyeong.week_6rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 6주차 과제 : 1181(단어 정렬), 1436(영화 감독 숌), 1676(팩토리얼 0의 개수)
 *
 * 1436, 영화 감독 숌
 * 출처: https://www.acmicpc.net/problem/1436
 *
 * 입력 : 첫째 줄에 N이 주어진다. N은 10,000보다 작거나 같은 자연수이다.
 *
 * 출력 : 첫째 줄에 N번째 영화의 제목에 들어간 수를 출력한다.
 *
 * @author byeongyeong, Lim
 */
public class BJ_1436 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;

        while (count != N) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
