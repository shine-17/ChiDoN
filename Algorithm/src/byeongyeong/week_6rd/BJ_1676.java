package byeongyeong.week_6rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 6주차 과제 : 1181(단어 정렬), 1436(영화 감독 숌), 1676(팩토리얼 0의 개수)
 *
 * 1676, 팩토리얼 0의 개수
 * 출처: https://www.acmicpc.net/problem/1676
 *
 * N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
 *
 * 입력 : 첫째 줄에 N이 주어진다.
 *
 * 출력 : 첫째 줄에 구한 0의 개수를 출력한다.
 *
 * @author byeongyeong, Lim
 */
public class BJ_1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        String resultNum = factorial(N);
        for (int i = resultNum.length() - 1; i > 1; i--) {
            if(resultNum.charAt(i) - '0' == 0) count++;
            else break;
        }

    }

    public static String factorial(int N) {
        BigInteger bigInt = new BigInteger("1");
        for (int i = 1; i <= N; i++) {
            bigInt = bigInt.multiply(BigInteger.valueOf(i));
        }
        String resultNum = bigInt.toString();
        return resultNum;
    }
}
