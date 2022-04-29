package com.company.StringAndSearching;

import java.util.Scanner;

public class LRU {
    public static int[] solution(int s, int n, int[] arr){
        int[] cache = new int[s];

        for(int i=0; i<n; i++){
            int pos = -1;
            for(int j=0; j<s; j++){
                if(arr[i]==cache[j]){
                    pos=j;
                }
            }
            if(pos==-1){
                for(int k=s-1; k>=1; k--){
                    cache[k] = cache[k-1];
                }
                cache[0]=arr[i];
            }else {
                for (int k = pos; k >= 1; k--) {
                    cache[k] = cache[k - 1];
                }
                cache[0] = arr[i];
            }
        }

        return cache;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        for(int x : solution(s, n,arr)){
            System.out.print(x+" ");
        }
    }
}
