package com.company.String;

import com.company.Main;

import java.util.Scanner;

public class 문자열찾기 {
    public static int solution(String str, char t){
        int answer=0;
        str =str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char x : str.toCharArray()) {
            if(x ==t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(solution(str,c));
    }

}
