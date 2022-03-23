package com.company.String;

import java.util.Scanner;

public class 문장속단어 {

    public static String solution(String str){
        String answer="";
        int m = Integer.MIN_VALUE, pos; //가장 작은값으로 초기화
        //split()
        /*
        String[] s = str.split(" ");
        for(String x: s){
            int len= x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
         */
        //indexOf() : 파라미터로 받은 원소의 위치 순서를 리턴,발견 못할시 -1 리턴
        //String.substring(start) //문자열  start위치부터 끝까지 문자열 자르기
        //String.substring(start,end) //문자열  start위치 부터 end전까지 문자열 발췌
        while ( (pos= str.indexOf(' '))!=-1 ){
            String tmp=str.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(solution(str));
    }
}
