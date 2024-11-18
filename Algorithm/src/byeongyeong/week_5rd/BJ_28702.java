package byeongyeong.week_5rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 5주차 과제 : 10989(수 정렬하기 3), 11050(이항 계수 1), 28702(FizzBuzz)
 *
 * 28702, FizzBuzz
 * 출처: https://www.acmicpc.net/problem/28702
 *
 * @author byeongyeong, Lim
 */
public class BJ_28702 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;

        // 숫자를 찾았는지 여부를 체크하는 변수
        boolean flag = false;

        for(int i=0; i<3; i++) { // 연속된 3개의 문자열이 오기 때문에
            String str = br.readLine();

            // 입력받은 문자열의 앞 문자만 따로 빼서 비교
            char c = str.charAt(0);

            if(c != 'F' && c != 'B') {
                num = Integer.parseInt(str);
                flag = true;
            }

            if(flag) {
                num++;
            }
        }

        if(num%3==0) {
            if(num%5==0) { // 3의 배수이자 5의 배수
                // FizzBuzz
                System.out.println("FizzBuzz");
            }
            else { // 3의 배수이지만 5의 배수가 아님
                // Fizz
                System.out.println("Fizz");
            }
        }
        else{
            if(num%5==0) { // 3의 배수는 아니지만 5의 배수
                // Buzz
                System.out.println("Buzz");
            }
            else { // 3의 배수도 아니고 5의 배수도 아님
                // 숫자 출력
                System.out.println(num);
            }
        }
    }
}
