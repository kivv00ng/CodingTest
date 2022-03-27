package com.company.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰수출력하기 {
    public static ArrayList<Integer> solution(int N, int[] il){
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(il[0]);

        for(int i=1; i<N; i++){
            if(il[i]>il[i-1]) answer.add(il[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] il = new int[N];
        for (int i = 0;i<N;i++){
            il[i] = kb.nextInt();
        }

        for (int x : solution(N, il)){
            System.out.print(x + " ");
        };
    }
}
