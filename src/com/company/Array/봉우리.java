package com.company.Array;

import java.util.Scanner;

public class 봉우리 {

    public static int solution(int N, int[][] arr) {
        /* 내가 구현한 답안
        int answer = 0;

        // 2차배열 반복하면서 해당 arr[i][j]값이 [i-1], [i+1],, [j+1], [j-1]보다 최대값이면 봉우리.count++
        // 인덱스값을 벗어날 경우 어떻게 해야하나?
        // => 애초에 테두리 값에 0을 추가해줘서 인덱스 벗어나는 경우를 방지

        for(int i=0; i<N+2; i++){
            for(int j=0; j<N+2; j++){
                System.out.print(arr[i][j]+" ");
                int tmp = arr[i][j];
                if(tmp!=0){
                    if(tmp > arr[i+1][j]&& tmp > arr[i-1][j] && tmp > arr[i][j+1] && tmp > arr[i][j-1]) {
                        answer++;
                    }
                }
            }
            System.out.println("");
        }

         */
        //
        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i= 0; i<N; i++){
            for(int j=0; j<N; j++){
                boolean flag=true;
                for(int k=0; k<4;k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx>=0 && nx<N && ny>=0 && ny<N && arr[nx][ny]> arr[i][j]){
                        flag=false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();

        /*
        int[][] arr = new int[N+2][N+2];
        for (int i = 0; i < N+2; i++) {
            for(int j =0; j < N+2;j++) {
                if(i ==0 || i ==N+1 || j==0 || j==N+1) {
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = kb.nextInt();
                }
            }
        }
         */
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for(int j =0; j < N;j++) arr[i][j] = kb.nextInt();
        }
        System.out.println(solution(N,arr));
    }
}
