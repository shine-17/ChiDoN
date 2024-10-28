package byeongyeong.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2주차 과제 목록 : [2231번(분해합), 2292번(벌집), 2798번(블랙잭)]
 *
 * 백준 2292번 문제, 벌집
 * 출처: https://www.acmicpc.net/problem/2292
 *
 * 문제 : 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
 * 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때
 * 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
 *
 *
 * 입력 : 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 * 출력 : 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
 *
 * @author byeongyeong, Lim
 */
public class BJ_2292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int roomCnt = 1; // 지나온 방의 갯수
        int range = 2; // 범위는 최소 2부터 시작

        if (N == 1) {
            System.out.print(1);
        } else  {
            while (range <= N) {	// 범위가 N보다 커지기 직전까지 반복
                /*
                * 결국 방의 갯수가 증가하는 것은 벌집의 층이 바뀔 때인데 문제 페이지에서 벌집의 그림을
                * 참고하면 벌집의 층은 6의 배수의 숫자만큼 방이 늘어날때마다 증가하게 된다.
                *
                * 1 -> 7 -> 19 -> ...
                * 따라서 범위를 설정하고 조건에 만족할 때까지만 층수를 증가시키면 됨
                * */
                range = range + (6 * roomCnt);
                roomCnt++;
            }
            System.out.print(roomCnt);
        }
    }
}
