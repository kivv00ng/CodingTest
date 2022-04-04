package com.company.TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class 최대길이연속부분수열 {
    public static int solution(int N, int M, int[] arr) {
        int answer=Integer.MIN_VALUE;
        int lt=0, rt=0;
        int cnt=0;

        while(rt<N){
            if(arr[rt]==1) ;
            else{
                cnt++;
                if(cnt>M){
                    if(rt-lt > answer) {
                        answer = rt-lt;
                    }
                    while(arr[lt++] != 0) ;
                    //이미 카운터값이 초과=> 0이 시작된 지점의 다음부터 재시작
                    cnt=M;
                }
            }
            rt++;
        }
        answer= Integer.max(answer, (rt-lt));

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
