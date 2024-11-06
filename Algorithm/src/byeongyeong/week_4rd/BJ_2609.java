package byeongyeong.week_4rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 4주차 과제 : 2609(최대공약수와 최소공배수), 2775(부녀회장이 될테야), 2869(달팽이는 올라가고 싶다)
 *
 * 2609, 최대공약수와 최소공배수
 * 출처: https://www.acmicpc.net/problem/2609
 *
 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 *
 *
 * 입력 : 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
 *
 * 출력 : 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
 *
 * @author byeongyeong, Lim
 */
public class BJ_2609 {

    /*
    * GCD가 대체 무슨 뜻일까? Greatest Common Divisor. 즉 가장 큰 공통된 약수라는 의미다.
    * => 풀이는 "유클리드 호제법 (Euclidean algorithm)" 활용, 유클리드 호제법은 아래 링크를 통해 이해
    *
    * 출처: https://st-lab.tistory.com/154
    *
    * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int d = gcd(a, b);	// 최대공약수

        System.out.println(d);
        System.out.println(a * b / d);

    }

    // 최대공약수 재귀 방식
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
        return gcd(b, a % b);
    }
}
