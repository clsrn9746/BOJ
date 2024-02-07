package baekjoon.basic1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 백준 9093번 단어 뒤집기
 */
public class BaekJoon9093 {
    public void baekJoonTurnWord() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int caseCnt = Integer.parseInt(st.nextToken());

        for(int i = 0; i < caseCnt; i++){
            st = new StringTokenizer(br.readLine());
            int cnt = st.countTokens();
            for (int j = 0; j < cnt; j++){
                String word = st.nextToken();
                for(int k = word.length() - 1; k >= 0; k--){
                    bw.write(String.valueOf(word.charAt(k)));
                }
                if(j != cnt - 1){
                    bw.write(" ");
                }else{
                    bw.write("\n");
                }
            }
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
