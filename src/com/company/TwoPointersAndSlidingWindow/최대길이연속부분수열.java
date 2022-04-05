package com.company.TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class 최대길이연속부분수열 {
    public static int solution(int N, int K, int[] arr) {
        int answer=Integer.MIN_VALUE;
        int lt=0;
        int cnt=0;
/*
        while(rt<N){
            if(arr[rt]==1) ;
            else{
                cnt++;
                if(cnt>K){
                    if(rt-lt > answer) {
                        answer = rt-lt;
                    }
                    while(arr[lt] != 0) lt++;
                    lt++;
                    //이미 카운터값이 초과=> 0이 시작된 지점의 다음부터 재시작
                    cnt=K;
                }
            }
            rt++;
        }
        answer= Integer.max(answer, (rt-lt));

 */
        for(int rt=0; rt<N; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>K){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer= Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = kb.nextInt();

        System.out.println(solution(N,K,arr));
    }
}
