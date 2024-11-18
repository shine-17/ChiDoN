package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ_28702_FizzBuzz {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int max = Integer.MIN_VALUE;
            List<String> list = new ArrayList<>();

            for(int i=0; i<3; i++) {
                list.add(br.readLine());
            }

            int[] arr = new int[3];
            int index = 0;

            for(int i=0; i<list.size(); i++) {
                String str = list.get(i);

                try {
                    int num = Integer.parseInt(str);
                    arr[i] = num;
                    index = i;
                } catch(Exception ignored) {}
            }

            int num = arr[index] + (3 - index);

            if(num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(num % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(num % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(num);
            }

        } catch(Exception ignored) {}
    }
}
