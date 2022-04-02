package com.company.TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class 두배열합치기 {
    public static ArrayList<Integer> solution(int N, int M, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<N && p2<M){
            if(arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        while(p1<N) answer.add(arr1[p1++]);
        while (p2<M) answer.add(arr2[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) arr1[i] = kb.nextInt();

        int M = kb.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) arr2[i] = kb.nextInt();


        for (int x: solution(N,M,arr1,arr2)){
            System.out.print(x+" ");
        }
}
}
