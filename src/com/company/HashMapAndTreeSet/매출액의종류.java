package com.company.HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 매출액의종류 {
    public static int[] solution(int N, int M, int[] arr){
        int[] answer= new int[N];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x: arr){
            map.put(x, map.getOrDefault(x,0)+1);

        }
        for (int x : map.keySet()){
            System.out.println("x:"+x+" value:"+map.get(x));
            

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int M = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i<N; i++){
            arr[i] = kb.nextInt();
        }
        for(int x: solution(N,M, arr)) System.out.print(x+" ");
    }
}
