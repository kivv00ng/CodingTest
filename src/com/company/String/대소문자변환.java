package com.company.String;

import java.util.Scanner;

public class 대소문자변환 {

    public static String solution(String str){
        String answer="";
        /*
        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        */
        //아스키 넘버
        //대문자: 65~90
        //소문자: 97~122
        //대소문자 차이 32를 통해 변환

        for (char x : str.toCharArray()) {
            if(x>=97 && x<=122) answer+=(char) (x-32);
            else answer+=(char) (x+32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        String str = kb.next();
        System.out.print(solution(str));
    }
}
