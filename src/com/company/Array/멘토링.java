package com.company.Array;

import java.util.Scanner;

public class 멘토링 {
    public static int solution(int N, int M, int[][] arr) {
        int answer = 0;
        /*
        for(int i=0; i<M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

         */
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                int cnt=0;
                for(int k=0; k<M; k++){
                    int pi=0, pj=0;
                    for(int s=0; s<N; s++){
                        if(arr[k][s] == i) pi=s;
                        if(arr[k][s] == j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==M){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int M = kb.nextInt();


        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for(int j = 0; j <N; j++) arr[i][j] = kb.nextInt();
        }
        System.out.println(solution(N, M, arr));
    }
}
