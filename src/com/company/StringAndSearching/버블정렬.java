package com.company.StringAndSearching;

import java.util.Scanner;

public class 버블정렬 {
    public static int[] solution(int n, int[] arr){

        for(int i=0; i<n-1; i++){
            for(int j=1; j<n-i; j++){
                if(arr[j-1]>arr[j]){
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        for(int x : solution(n,arr)){
            System.out.print(x+" ");
        }
    }
}
