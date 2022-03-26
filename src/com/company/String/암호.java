package com.company.String;

import java.util.ArrayList;
import java.util.Scanner;

public class 암호 {

    public static String solution(int N, String str){
        String answer="";
        /*
        char[] cl = str.toCharArray();
        String s = "";
        int tmp = 0;
        ArrayList<String> sl = new ArrayList<>();

        //2진수로 변환
        for (int i = 0; i<N*7; i++) {
            if(cl[i]=='#') s +="1";
            else s+="0";
            if(i%7==6){
                sl.add(s);
                s="";
            }
        }
        //System.out.println(sl);
        //10진수 변환 후,각 값에 해당하는 아스키코드 문자로 변환
        for (int i=0; i<N;i++){
            tmp= Integer.parseInt(sl.get(i),2);
            //System.out.println(tmp);
            answer+= (char) tmp;
        }

         */

        for(int i=0; i<N; i++){
            String tmp =str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        String str = kb.next();
        System.out.print(solution(N, str));
    }
}
