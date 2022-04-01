package com.company.Array;

import java.util.Scanner;

public class 임시반장정하기 {
    public static int solution(int N, int[][] arr) {
        int answer = 0;
        int Max = Integer.MIN_VALUE;


        //기준 학생 반복문, i번 학생 기준으로 각 학생 확인할 반복문, i번 학생과 j번 학생의 각 학년 확인할 반복문
        for (int i=1; i<=N; i++){ //학생 기준
            int cnt = 0;
            for(int j=1; j<=N; j++) { //다른 학생
                for(int k=1; k<=5; k++) { //학년
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>Max){
                Max=cnt;
                answer=i;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();

        int[][] arr = new int[N+1][6];
        for (int i = 1; i <= N; i++) {
            for(int j =1; j <=5; j++) arr[i][j] = kb.nextInt();
        }
        System.out.println(solution(N,arr));
    }
}
