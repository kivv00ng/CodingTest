package com.company.String;

import java.util.Arrays;
import java.util.Scanner;

public class 가장짧은문자거리 {

    public static int[] solution(String str, char c){
        /*
        //nextLine()으로 받을경우
        //분리
        String[] s = str.split(" ");
        str = s[0];
        char c = s[1].charAt(0);
        char[] cl =str.toCharArray();

        int[] answer= new int[cl.length];

         */
        /*
        for (int i=0; i<cl.length; i++) {
            if (cl[i] == c) {
                answer[i] = 0;
            }
            else {
                answer[i]=1000;
            }
            //System.out.println("i ="+i+ "//  answer=" + answer[i]);
        }

        for (int i=0; i<cl.length; i++) {
            Boolean br= true;
            int tmp = 1;
            if(answer[i]==0) continue;

            while(br) {
                if (i - tmp < 0) {
                    if (answer[i + tmp] == 0) {
                        answer[i] = tmp;
                        br=false;
                    }
                } else if (i + tmp > cl.length - 1) {
                    if (answer[i - tmp] == 0) {
                        answer[i] = tmp;
                        br=false;
                    }
                } else {
                    if (answer[i - tmp] == 0 || answer[i + tmp] == 0) {
                        answer[i] = tmp;
                        br=false;
                    }
                }
                //System.out.println("i= "+ i + "// tmp= "+tmp);
                tmp++;

            }
        }

         */
        /*
        char[] cl =str.toCharArray();
        int[] answer= new int[cl.length];
        int p = 1000;
        for(int i=0; i<answer.length;i++){
            if(cl[i]==c){
                p=0;
            }
            else {
                p++;
            }
            answer[i]=p;
        }
        p=1000;
        for(int i=answer.length-1; i>=0; i--){
            if(answer[i]==0){
                p=0;
                continue;
            }
            else {
                p++;
                if(answer[i]>p) answer[i] =p;
            }
        }

         */
        int[] answer = new int[str.length()];
        int p=1000;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==c){
                p=0;
                answer[i]=p;
            }else {
                p++;
                answer[i] = p;
            }
        }
        p=1000;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==c) p=0;

            else {
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : solution(str, c)){
            System.out.print(x + " ");
        }
    }
}
