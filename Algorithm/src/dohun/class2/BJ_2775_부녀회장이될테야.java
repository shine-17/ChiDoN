package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2775_부녀회장이될테야 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            StringBuffer sb = new StringBuffer();
            int t = Integer.parseInt(br.readLine());

            int[][] aparts = new int[15][15];
            for(int i=0; i<aparts.length; i++){
                for(int j=1; j<aparts[i].length; j++){
                    if (i == 0) {
                        aparts[i][j] = j;
                    }
                    else {
                        int sum = 0;
                        for(int k=1; k<=j; k++){
                            sum += aparts[i-1][k];
                        }

                        aparts[i][j] = sum;
                    }
                }
            }

            for(int i=0; i<t; i++) {
                int k = Integer.parseInt(br.readLine()); // 층, 0층부터 시작
                int n = Integer.parseInt(br.readLine()); // 호, 1호부터 시작

                sb.append(aparts[k][n]).append("\n");
            }

            System.out.println(sb);

        } catch(Exception ignored) {}
    }
}
