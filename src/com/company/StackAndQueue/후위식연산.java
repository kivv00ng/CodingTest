package com.company.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    public static int solution(String str){
        int answer=0;
        Stack<Integer> stack = new Stack<>();

        // 아스키 코드'0': 48 => 'char' - 48 => 해당 숫자
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(c-48);
                //stack.push(Character.getNumericValue(c));
            }else{
                int rt=stack.pop();
                int lt=stack.pop();
                if(c=='+') stack.push(lt+rt);
                else if(c=='-') stack.push(lt-rt);
                else if(c=='*') stack.push(lt*rt);
                else if(c=='/') stack.push(lt/rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(solution(str));
    }
}
