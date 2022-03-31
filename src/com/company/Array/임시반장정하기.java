package com.company.Array;

import java.util.Scanner;

public class 임시반장정하기 {
    public static int solution(int N, int[][] arr) {
        int answer = 0;
        int cnt = 0;
        int Max = Integer.MIN_VALUE;

        //각 arr[j][i]값중 같은걸 cnt ++;
        //다 끝나고 cnt>=Max 크면 i값 answer값에
        //만약 cnt==Max 이라면 Math.min()이용해서 더 작은 i값 저장


        for (int i=0; i<N; i++){ //학생 기준
            for(int j=0; j<N; j++) { //학년
                for(int k=0; k<N; k++){ //학년마다 같은반 있는지 다른학생들 확인
                    if(k==i) int tmp = arr[j][k];
                    if(arr[k][j] ==arr[i]) cnt ++;
                }
            }
        }


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
