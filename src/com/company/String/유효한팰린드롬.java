package com.company.String;

import java.util.Scanner;

public class 유효한팰린드롬 {
    public static String solution(String str){
        String answer="NO";
        //
        //
        //A-Z가 아니면(정규표현식) 빈문자열로 변경
        str =str.toUpperCase().replaceAll("[^A-Z]","");
        //System.out.println(str);
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(solution(str));
    }
}
