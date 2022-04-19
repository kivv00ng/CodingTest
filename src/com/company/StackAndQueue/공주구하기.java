package com.company.StackAndQueue;

import java.util.*;

public class 공주구하기 {
    public static int solution(int n, int k){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n;i++){
            queue.offer(i);
        }
        /*
        int cnt=0;
        while(queue.size()!=1){
            int tmp = queue.poll();
            cnt++;

            if(cnt==k){
                cnt=0;
                continue;
            }
            queue.offer(tmp);
        }
        answer= queue.poll();
         */
        while(!queue.isEmpty()){
            for(int i=1; i<k; i++){
                queue.offer(queue.poll());
            }
            queue.poll();
            if(queue.size()==1){
                answer = queue.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.print(solution(n, k));
    }
}