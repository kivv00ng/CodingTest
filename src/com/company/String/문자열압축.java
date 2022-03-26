package com.company.String;

import java.util.Scanner;

public class 문자열압축 {
    public static String solution(String str){
        String answer="";
        str+=" ";
        char[] cl = str.toCharArray();
        int count = 1;

        for (int i = 0; i<cl.length-1; i++) {
           if(cl[i]==cl[i+1]){
               count++;
           }
           else{
               answer+=cl[i];
               if(count>1) answer += Integer.toString(count);
               count=1;
           }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(solution(str));
    }
}
