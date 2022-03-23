package com.company;

import java.util.Scanner;

public class Main {
    public static String solution(String str){
        String answer="";
        str =str.toUpperCase();

        for (char x : str.toCharArray()) {
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(solution(str));
    }
}
