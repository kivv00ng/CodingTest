package com.company.StackAndQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    public static String solution(String str){
        /*
        String answer="NO";
        List<Character> stack = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(') {
                stack.add('(');
            }else if (str.charAt(i)==')'){
                try {
                    stack.remove(stack.size() - 1);
                }catch (Exception e){
                    return answer;
                }
            }
        }
        if(stack.size()==0){
            return "YES";
        }
        return answer;
         */
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '('){
                stack.push(c);
            } else{
                if(stack.empty()){
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(solution(str));
    }
}
