package com.company.HashMapAndTreeSet;


import java.util.*;

public class K번째큰수 {
    public static int solution(int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1;j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt==k){
                return x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}
