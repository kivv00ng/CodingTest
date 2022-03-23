package com.company.String;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {
    public static ArrayList<String> solution(int N, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x: str){
            /*
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
             */
            //직접구현
            char[] s = x.toCharArray();
            int lt=0, rt=x.length()-1;

            while (lt<rt){
                char tmp=s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(s);
            answer.add(tmp);

        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        String[] str = new String[N];

        for(int i=0; i<N; i++){
            str[i] = kb.next();
        }

        for(String x: solution(N, str)){
            System.out.println(x);
        }

    }
}
