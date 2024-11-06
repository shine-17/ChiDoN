package byeongyeong.week_3rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 3주차 과제 : 15829(Hashing), 1259(팰린드롬수), 1546(평균)
 *
 * 15829, Hashing
 * 출처: https://www.acmicpc.net/problem/15829
 *
 * 해당 문제는 길기 때문에 링크 참조
 *
 * 입력 : 첫 줄에는 문자열의 길이 L이 들어온다. 둘째 줄에는 영문 소문자로만 이루어진 문자열이 들어온다.
 * 입력으로 주어지는 문자열은 모두 알파벳 소문자로만 구성되어 있다.
 *
 * 출력 : 문제에서 주어진 해시함수와 입력으로 주어진 문자열을 사용해 계산한 해시 값을 정수로 출력한다.
 *
 * @author byeongyeong, Lim
 */
public class BJ_15829 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine()); // 문자열의 길이

        String str = br.readLine();

        BigInteger sum = new BigInteger("0");
        BigInteger r = new BigInteger("31");
        BigInteger power = new BigInteger("1");

        for(int i=0; i < L; i++) {
            sum = sum.add(new BigInteger(String.valueOf(str.charAt(i)-96)).multiply(power));
            power = power.multiply(r);
        }

        System.out.println(sum.mod(new BigInteger("1234567891")));
    }
}
