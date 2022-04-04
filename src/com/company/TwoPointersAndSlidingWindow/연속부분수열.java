package com.company.TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class 연속부분수열 {
    public static int solution(int N, int M, int[] arr) {
        int answer=0;
        int sum=0;
        int lt=0;

        for (int rt=0; rt<N; rt++) {
            sum+=arr[rt];
            if(sum==M) answer++;
            while(sum>=M){
                sum-=arr[lt++];
                if(sum==M) answer++;
            }
        }

        /*
        while(rt<N){
            sum+=arr[rt];

            if(sum==M){
                answer++;
                rt++;
            } else if(sum<M){
                rt++;
            } else{
                sum = sum- arr[rt];
                sum = sum - arr[lt++];
            }
        }

         */


        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int M = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = kb.nextInt();

        System.out.println(solution(N,M,arr));
    }
}
