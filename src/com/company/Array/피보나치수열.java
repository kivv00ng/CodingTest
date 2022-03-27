package com.company.Array;

import java.util.Scanner;

public class 피보나치수열 {
    public static int[] solution(int N){
        int[] answer=  new int[N];
        answer[0]=1;
        answer[1]=1;
        for(int i=2; i<N; i++){
            answer[i] = answer[i-2]+answer[i-1];
        }

        return answer;
    }

    //배열 안쓰고 손코딩
    public static void solution2(int N){
        int a=1, b=1, c;
        System.out.print(a + " "+ b +" ");
        for(int i=2; i<N; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        for (int x: solution(N)){
            System.out.print(x + " ");
        }
    }
}
