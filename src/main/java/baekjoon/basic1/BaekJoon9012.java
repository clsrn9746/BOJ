package baekjoon.basic1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 백준 9012번 괄호
 */
public class BaekJoon9012 {

    public void baekJoonBracket() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int SIZE = Integer.parseInt(st.nextToken());

        for(int i = 0; i < SIZE; i++){
            st = new StringTokenizer(br.readLine());
            final String INPUT_STRING = st.nextToken();
            char[] charArr = INPUT_STRING.toCharArray();
            int cnt = 0;
            boolean check = false;

            for(int j = 0; j < INPUT_STRING.length(); j++){
                if(charArr[0] == ')'){
                    cnt--;
                    break;
                }else{
                    if(charArr[j] == '('){
                        cnt++;
                    }else{
                        cnt--;
                    }
                }

                if(cnt < 0){
                    break;
                }
            }

            if(cnt == 0){
                check = true;
            }

            if(check){
                bw.write("YES\n");
            }else{
                bw.write("NO\n");
            }
            bw.flush();
        }

        br.close();
        bw.close();
    }

}
