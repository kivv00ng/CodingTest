package com.company.Array;

import java.util.Scanner;

public class 소수 {
    public static int solution(int N){
        //에라토스테네스 체
        int answer = 0;
        int[] ch = new int[N+1];

        for (int i=2; i<=N; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=N; j=j+i) ch[j]=1; //j가 i의 배수이므로 i씩 증가
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        System.out.println(solution(N));
    }
}
