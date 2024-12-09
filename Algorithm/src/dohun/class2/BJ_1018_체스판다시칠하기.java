package dohun.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1018_체스판다시칠하기 {

    private static final int chessSize = 8;
    private static char[][] boards;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            boards = new char[n][m];
            for(int i=0; i<n; i++) {
                boards[i] = br.readLine().toCharArray();
            }

            int min = Integer.MAX_VALUE;
            for(int i=0; i<n+1 - chessSize; i++) {
                for(int j=0; j<m+1 - chessSize; j++) {
                    min = Math.min(min, findChess(i, j));
                }
            }

            System.out.println(min);

        } catch (Exception ignored) {}
    }

    static int findChess(int x, int y) {
        boolean startWhite = true;
        boolean startBlack = true;
        int white = 0;
        int black = 0;

        for(int i=x; i<x+chessSize; i++) {
            for(int j=y; j<y+chessSize; j++) {
                if(boards[i][j] == 'W') {
                    if(!startWhite) white++;
                    if(startBlack) black++;
                }
                else {
                    if(startWhite) white++;
                    if(!startBlack) black++;
                }

                startWhite = !startWhite;
                startBlack = !startBlack;
            }

            startWhite = !startWhite;
            startBlack = !startBlack;
        }

        return Math.min(white, black);
    }
}
