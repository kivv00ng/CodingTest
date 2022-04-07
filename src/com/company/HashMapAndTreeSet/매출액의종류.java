package com.company.HashMapAndTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 매출액의종류 {
    public static ArrayList<Integer> solution(int N, int K, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();


        for(int i =0; i<K-1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i],0)+1);
        }

        int lt = 0;
        for (int rt=K-1;rt<N; rt++){
            HM.put(arr[rt], HM.getOrDefault(arr[rt],0)+1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt])-1);
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i<N; i++){
            arr[i] = kb.nextInt();
        }
        for(int x: solution(N,K, arr)) System.out.print(x+" ");
    }
}
