package com.company.TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class 연속된자연수의합 {
    public static int solution(int N){
        int answer=0;
        int lt=0, sum=0;

        for(int rt = 1; rt<(N/2)+2; rt++){
            sum+=rt;
            if(sum==N) answer++;
            while(sum>=N){
                sum-=lt++;
                if(sum==N) answer++;
            }
        }

        /*

         */
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        System.out.print(solution(N));
    }
}
