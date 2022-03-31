package com.company.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수 {
    public static boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> solution(int N, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<N; i++){
            int tmp =arr[i];
            int res=0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]= kb.nextInt();
        }
        for (int x : solution(N, arr)){
            System.out.print(x + " ");
        }

    }
}
