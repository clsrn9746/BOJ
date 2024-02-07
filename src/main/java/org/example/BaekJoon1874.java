package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon1874 {

    public void baekJoon1874() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int SIZE = Integer.parseInt(st.nextToken());
        List<Integer> stackList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int max = 0;
        int before = 0;
        boolean check = true;

        for(int i = 0; i < SIZE; i++){
            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());

            if(before < input && max < input){
                for(int j = max + 1; j <= input; j++){
                    stackList.add(j);
                    sb.append("+\n");
                }
                max = input;
                removeLast(stackList);
                sb.append("-\n");
            }else if(before > input){
                if(max < input){
                    check = false;
                    break;
                }else{
                    while(true){
                        if(!stackList.isEmpty()){
                            int last = getLast(stackList);
                            removeLast(stackList);
                            sb.append("-\n");
                            if(input == last){ break; }
                        }else{
                            check = false;
                            break;
                        }
                    }
                }
            }else{
                check = false;
                break;
            }

            before = input;
        }

        if(check){
            bw.write(sb.toString());
        }else{
            bw.write("NO");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public int getLast(List<Integer> list){
        return list.get(list.size()-1);
    }

    public void removeLast(List<Integer> list){
        list.remove(list.size()-1);
    }

}
