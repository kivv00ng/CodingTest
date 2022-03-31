package com.company.Array;

import java.util.Scanner;

public class 등수구하기 {
    public static int[] solution(int N, int[] arr) {
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j=0; j<N; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            answer[i]=cnt;
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : solution(N, arr)) {
            System.out.print(x + " ");
        }
    }
}
