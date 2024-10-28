package byeongyeong.week_2rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* 2주차 과제 목록 : [2231번(분해합), 2292번(벌집), 2798번(블랙잭)]
*
* 백준 2231번 문제, 분해합
* 출처: https://www.acmicpc.net/problem/2231
*
* 문제 : 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
* 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다.
* 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
*
* 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
*
* 입력 : 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
* 출력 : 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 *
 * @author byeongyeong, Lim
* */
public class BJ_2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strN = br.readLine();

        int NLength = strN.length(); // 문자열 길이

        int N = Integer.parseInt(strN); // 문자열을 정수(int)로 변환, 자연수가 주어지지 않을시 formatting error 발생
        int result = 0;


        /*
        * 주어진 문제에서 가장 작은 생성자를 구해내는 프로그램을 작성하는 것.
        * 아래 공식에 대한 설명을 더하자면
        * ex) f(x)는 분해합의 공식, K는 주어진 자연수, K1 ~ K3은 가장 큰 자릿수의 숫자부터 순차적으로
        * f(x) = K + K1 + K2 + K3
        *
        * 우리가 구해야하는 것은 주어진 숫자의 분해합이다.
        *
        * K = f(x) - (K1 + K2 + K3)
        * K가 최솟값이 될려면 각자릿수 모두 9일때 최솟값이 됨
        * K = f(x) - (9 + 9 + 9)
        * = f(x) - (9*3)
        *
        * 따라서 i를 가능한 최솟값인 N - 9 * N의 각 자릿수부터 시작
        * 브루트포스 알고리즘(Brute Force Algorithm) 적용
        * */
        for(int i = (N - (NLength * 9)); i < N; i++) {
            int number = i;
            int sum = 0; // 각 자릿수 합 변수

            while(number != 0) {
                sum += number % 10;	// 각 자릿수 더하기
                number /= 10;
            }

            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
            if(sum + i == N) {
                result = i;
                break;
            }

        }

        System.out.println(result);
    }
}
