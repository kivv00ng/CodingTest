package com.company.Array;

import java.util.Scanner;

public class 격자판최대합 {
    public static int solution(int N, int[][] arr) {
        /* 내가 구현
        //2차배열로 만들고 입력받는다
        //각 일차배열들의 합 중 max --행
        //각 열들의 합 [i][j] 해서 각열들의 합 max --열
        //tmp1  i랑 j가 같을경우 배열 따로 만들어서 max, tmp2값에 i+j값이 N-1일때 값넣고 max --대각선

        int answer = 0;
        int G_max=0; //가로
        int S_max=0; //세로
        int D_max=0; //대각선
        int[][] D= new int[2][N]; //대각선 값 저장

        //각 행의 max값 및 대각선 배열 생성
        for (int i = 0; i < N; i++) {
            int tmp=0;
            for(int j=0; j<N; j++){
                tmp +=arr[i][j];
                if(i==j) D[0][i] =arr[i][j];
                else if( i+j == N-1) D[1][i] = arr[i][j];
            }
            if(G_max < tmp){
                G_max = tmp;
            }


        }
        //열의 max값
        for (int i = 0; i < N; i++) {
            int tmp=0;
            for(int j=0; j<N; j++){
                tmp +=arr[j][i];
            }
            if(S_max < tmp){
                S_max = tmp;
            }
        }
        //대각선
        for (int i=0; i <2; i++){
            int tmp=0;
            for (int j=0; j<N; j++){
                tmp += D[i][j];
            }
            if(D_max<tmp) D_max=tmp;
        }

        answer = Math.max(G_max,S_max);
        answer = Math.max(answer, D_max);
         */

        //참조 답
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i=0; i<N; i++){
            sum1=sum2=0;
            for(int j=0; j<N; j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for (int i = 0; i<N; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][N-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for(int j =0; j < N;j++) arr[i][j] = kb.nextInt();
        }
        System.out.println(solution(N,arr));
    }
}
