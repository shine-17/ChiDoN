package byeongyeong.week_5rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 5주차 과제 : 10989(수 정렬하기 3), 11050(이항 계수 1), 28702(FizzBuzz)
 *
 * 11050, 이항 계수 1
 * 출처: https://www.acmicpc.net/problem/11050
 *
 * @author byeongyeong, Lim
 */
public class BJ_11050 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(BC(N, K));

    }

    static int BC(int n, int k) {

        if(n == k || k == 0) {
            return 1;
        }

        return BC(n - 1, k - 1) + BC(n - 1, k);
    }
}
