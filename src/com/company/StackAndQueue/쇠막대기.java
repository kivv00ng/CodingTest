package com.company.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {

    public static int solution(String str){
        int answer=0;
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push('(');
                continue;
            }
            stack.pop();
            if(str.charAt(i-1)=='('){
                answer +=stack.size();
                continue;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(solution(str));
    }

}
