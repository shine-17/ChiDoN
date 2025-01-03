package byeongyeong.week_2rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2주차 과제 목록 : [2231번(분해합), 2292번(벌집), 2798번(블랙잭)]
 *
 * 백준 2798 문제, 블랙잭
 * 출처: https://www.acmicpc.net/problem/2798
 *
 * 문제 : 카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다.
 * 카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다. 블랙잭은 카지노마다 다양한 규정이 있다.
 * 한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.
 * 김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다.
 *
 * 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
 *
 * 이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
 *
 * N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
 *
 *
 * 입력 : 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다.
 * 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다. 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
 *
 * 출력 : 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
 *
 * @author byeongyeong, Lim
 */
public class BJ_2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, N, M);
        System.out.println(result);
    }

    // 탐색
    static int search(int[] arr, int N, int M) {
        int result = 0;

        for (int i = 0; i < N - 2; i++) { // 숫자 배열 중 중복되지 않게 값을 가져온다고 했을때 처음 숫자의 범위는 전체 갯수 N - 2가 되어야함

            if (arr[i] > M) continue; // 첫 숫자가 주어진 합보다 크면 반복문 종료

            for (int j = i + 1; j < N - 1; j++) { // 두번째 숫자는 그보다 범위는 늘어나게 됨

                if (arr[i] + arr[j] > M) continue; // 첫번째 숫자와의 합이 M 보다 크면 종료

                for (int k = j + 1; k < N; k++) { // 마지막 숫자 범위는 마지막 인덱스까지
                    int temp = arr[i] + arr[j] + arr[k]; // 현재 3개 숫자의 합

                    if (M == temp) {
                        return temp; // 주어진 합과 같으면 즉시 값 반환
                    }

                    if(result < temp && temp < M) { // 현재까지 계산된 결과값보다 크면서 주어진 합보다 작으면 결과값 업데이트
                        result = temp;
                    }
                }
            }
        }

        // 모든 순회를 마치면 result 리턴
        return result;
    }
}
