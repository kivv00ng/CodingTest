package com.company.HashMapAndTreeSet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 학급회장 {
    public static Character solution(int N, String str){
        Character answer=' ';
        str =str.toUpperCase();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        /*
        hashMap.put('A',0);
        hashMap.put('B',0);
        hashMap.put('C',0);
        hashMap.put('D',0);
        hashMap.put('E',0);

        for (char x : str.toCharArray()) {
            int tmp =hashMap.get(x)+1;
            hashMap.put(x,tmp);
        }
        Integer max = Collections.max(hashMap.values());

         for (char x : hashMap.keySet()) {
            int tmp =hashMap.get(x);
            if(tmp==max) answer=x;

        }

         */

        //getOrDefault(해당 value값에 해당하는 key값, 없을시 default값)
        for (char x: str.toCharArray()){
            hashMap.put(x, hashMap.getOrDefault(x, 0)+1);
        }

        int max= Integer.MIN_VALUE;

        for (char key : hashMap.keySet()) {
            if(hashMap.get(key)>max) {
                max=hashMap.get(key);
                answer=key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        String str = kb.next();

        System.out.print(solution(N, str));
    }
}
