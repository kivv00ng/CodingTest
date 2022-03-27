package com.company.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 보이는학생 {
    public static int solution(int N, int[] arr){
        int answer=  1;
        int max=arr[0];
        for(int i=1; i<N; i++){
            if(arr[i]>max) {
                answer++;
                max=arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0;i<N;i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(N, arr));
    }
}
