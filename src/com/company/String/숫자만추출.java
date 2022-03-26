package com.company.String;

import java.util.Scanner;

public class 숫자만추출 {
    public static int solution(String str){
        //int answer=0;
        /*
        str =str.toUpperCase().replaceAll("[A-Z]","");
        answer= Integer.parseInt(str);
        */

        //아스키코드 이용
        //문자 '0': 48
        //문자 '9': 57
        /*
        for (char x: str.toCharArray()){
            // 기존 answer에 'x10'을 해주면 자릿수 증가 되고 현재값을 1의자리에 추가 가능
            if(x>=48 && x<=57) answer=answer*10+(x-48);
        }

         */
        String tmp="";
        //Character.isDigit()함수 사용해서 해당값 숫자인지 확인
        for(char x: str.toCharArray()){
            if(Character.isDigit(x)) tmp+=x;
        }
        return Integer.parseInt(tmp);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(solution(str));
    }
}
