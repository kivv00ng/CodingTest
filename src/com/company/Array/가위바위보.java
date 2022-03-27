package com.company.Array;

import java.util.Scanner;

public class 가위바위보 {
    public static char[] solution(int N,int[] arr1, int[] arr2){
        char[] answer=new char[N];
        //1:가위, 2:바위, 3:보
        for (int i=0; i<N; i++){
           /*
            if(arr1[i]==1 && arr2[i]==1) answer[i]='D';
            else if(arr1[i]==1 && arr2[i]==2) answer[i]='B';
            else if(arr1[i]==1 && arr2[i]==3) answer[i]='A';
            else if(arr1[i]==2 && arr2[i]==1) answer[i]='A';
            else if(arr1[i]==2 && arr2[i]==2) answer[i]='D';
            else if(arr1[i]==2 && arr2[i]==3) answer[i]='B';
            else if(arr1[i]==3 && arr2[i]==1) answer[i]='B';
            else if(arr1[i]==3 && arr2[i]==2) answer[i]='A';
            else if(arr1[i]==3 && arr2[i]==3) answer[i]='D';

            */
            if(arr1[i]== arr2[i]) answer[i]='D';
            else if(arr1[i]==1 && arr2[i]==3) answer[i]='A';
            else if(arr1[i]==2 && arr2[i]==1) answer[i]='A';
            else if(arr1[i]==3 && arr2[i]==2) answer[i]='A';
            else{
                answer[i]='B';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        for (int i = 0;i<N;i++){
            arr1[i] = kb.nextInt();
        }
        for (int i = 0;i<N;i++){
            arr2[i] = kb.nextInt();
        }
        for(char x: solution(N, arr1, arr2)){
            System.out.println(x);
        }
    }
}
