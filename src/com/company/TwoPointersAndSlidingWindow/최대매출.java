package com.company.TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 최대매출 {
    public static int solution(int N, int K, int[] arr) {
        int answer=0;
        for (int i=0; i<K;i++){
            answer += arr[i];
        }
        int tmp=answer;

        for (int i=K; i<N;i++){
            tmp = tmp-arr[i-K]+arr[i]; // tmp += (arr[i]-arr[i-K]);
            if(tmp>answer) answer=tmp;
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
