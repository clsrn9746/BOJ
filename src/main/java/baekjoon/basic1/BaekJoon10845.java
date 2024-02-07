package baekjoon.basic1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 백준 10845번 큐
 */
public class BaekJoon10845 {

    public void baekJoon10845() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int SIZE = Integer.parseInt(st.nextToken());

        Queue<String> queue = new LinkedList<>();
        String value = "";

        for(int i = 0; i < SIZE; i++){
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()){
                case "push":
                    value = st.nextToken();
                    queue.offer(value);
                    break;
                case "pop":
                    if(queue.isEmpty()){ bw.write("-1" + "\n"); }
                    else{ bw.write(queue.poll() + "\n"); }
                    bw.flush();
                    break;
                case "front":
                    if(queue.isEmpty()){ bw.write("-1" + "\n"); }
                    else{ bw.write(queue.peek() + "\n"); }
                    bw.flush();
                    break;
                case "empty":
                    if(queue.isEmpty()){ bw.write("1" + "\n"); }
                    else{ bw.write("0" + "\n"); }
                    bw.flush();
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    bw.flush();
                    break;
                case "back":
                    if(queue.isEmpty()){ bw.write("-1" + "\n"); }
                    else{ bw.write(value + "\n"); }
                    bw.flush();
                    break;
            }
        }
        bw.close();
        br.close();
    }

}
