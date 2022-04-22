package com.company.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {
    public static String solution(String necessarySubject, String subjects){
        String answer = "NO";
        Queue<Character> queue = new LinkedList<>();

        for(char c: necessarySubject.toCharArray()){
            queue.offer(c);
        }

        for(char c: subjects.toCharArray()){
            if(queue.peek() == c){
                queue.poll();
            }

            if(queue.isEmpty()){
                return "YES";
            }

        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String necessarySubject = scanner.next();
        String subjects = scanner.next();

        System.out.print(solution(necessarySubject, subjects));
    }
}
