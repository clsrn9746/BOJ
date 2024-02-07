package baekjoon.basic1;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

/**
 * 백준 1406번 에디터
 */
public class BaekJoon1406 {

    public void baekJoon1406() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String word = st.nextToken();
        LinkedList<Character> charList = new LinkedList<>();

        for(int i = 0; i < word.length(); i++){
            charList.add(word.charAt(i));
        }

        ListIterator<Character> charIter = charList.listIterator();
        //커서 맨 뒤
        while(charIter.hasNext()){
            charIter.next();
        }

        st = new StringTokenizer(br.readLine());
        final int SIZE = Integer.parseInt(st.nextToken());

        for(int i = 0; i < SIZE; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command){
                case "L":
                    if(charIter.hasPrevious()){ charIter.previous(); }
                    break;
                case "D":
                    if(charIter.hasNext()){ charIter.next(); }
                    break;
                case "B":
                    if(charIter.hasPrevious()){
                        charIter.previous();
                        charIter.remove();
                    }
                    break;
                case "P":
                    charIter.add(st.nextToken().charAt(0));
                    break;
            }
        }

        for(char c : charList){
            bw.write(c);
        }

        bw.close();
        br.close();
    }
}
