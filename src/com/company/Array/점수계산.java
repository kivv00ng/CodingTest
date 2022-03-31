package com.company.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 점수계산 {
    public static int solution(int N, int[] arr){
        int answer= 0;
        int cnt = 1;
        for(int i=0; i<N; i++){
            if(arr[i]==1){
                answer+=cnt;
                cnt++;
            }else{
                cnt=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]= kb.nextInt();
        }
        System.out.println(solution(N, arr));

    }
}
