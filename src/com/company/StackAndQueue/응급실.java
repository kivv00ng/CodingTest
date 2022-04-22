package com.company.StackAndQueue;

import java.lang.reflect.Array;
import java.util.*;


class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
public class 응급실 {

    public static int solution(int n, int m, int[] arr){
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i=0; i<n; i++){
            queue.offer(new Person(i, arr[i]));
        }

        while(!queue.isEmpty()){
            Person tmp = queue.poll();
            for(Person p: queue){
                if(p.priority>tmp.priority){
                    queue.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m){
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.print(solution(n, m, arr));
    }
}
