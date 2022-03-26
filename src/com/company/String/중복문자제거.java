package com.company.String;

import java.util.Scanner;

public class 중복문자제거 {
    public static String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
            //indexOf()가 값의 가장 맨앞에 존재하는 데이터의 위치를 출력하므로 i와 indexDi()의 값이 같을 경우에만 answer에 추가
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer +=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(solution(str));
    }
}
