package com.company.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {
    public static int solution(int n, int k, int[][] arr, int[] moving){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
                /*
        for(int i = 0; i < k; i++){
            for (int j = 0; j < n; j++){
                if(arr[j][moving[i]-1] != 0){
                    if(stack.empty()){
                        stack.add(arr[j][moving[i]-1]);
                    } else{
                        int tmp = stack.pop();
                        if(tmp ==  arr[j][moving[i]-1]){
                            answer+=2;
                        }else{
                            stack.add(tmp);
                            stack.add(arr[j][moving[i]-1]);
                        }
                    }
                    arr[j][moving[i]-1] = 0;
                    break;
                }
            }
        }
         */

        for(int pos: moving){
            for(int i=0; i<arr.length; i++){
                if(arr[i][pos-1] !=0){
                    int tmp = arr[i][pos-1];
                    arr[i][pos-1]=0;
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer+=2;
                        stack.pop();
                    }else{
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++ ){
                arr[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();
        int[] moving = new int[k];
        for(int i =0; i<k; i++){
            moving[i] = scanner.nextInt();
        }

        System.out.print(solution(n, k, arr, moving));
    }
}
