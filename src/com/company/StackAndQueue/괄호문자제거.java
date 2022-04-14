package com.company.StackAndQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    public static String solution(String str){
        String answer="";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray() ){
            if(c == ')'){
                while(stack.pop() != '(');
            }else{
                stack.add(c);
            }
        }
        for (int i=0; i<stack.size(); i++){
            answer += stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(solution(str));
    }
}
