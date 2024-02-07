package org.example;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack_1 {
    private static Stack_1 instance;

    private Stack_1() {}

    public static synchronized Stack_1 getInstance(){
        if(instance == null){
            instance = new Stack_1();
        }
        return instance;
    }

    public void baekJoonStack() throws IOException{
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());

        for(int i = 0; i < cnt; i++){
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            if(str.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if(str.equals("top")){
                if(stack.empty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }
            }else if(str.equals("size")){
                System.out.println(stack.size());
            }else if(str.equals("empty")){
                if(stack.empty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(str.equals("pop")){
                if(stack.empty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.pop());
                }
            }
        }

        br.close();
    }
}