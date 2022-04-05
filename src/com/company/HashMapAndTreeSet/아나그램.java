package com.company.HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    public static String solution(String str1, String str2){
        String answer= "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x: str1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        //같은 길이의 배열이 입력되므로, 하나의 value값이 0이아니더라도 다른 하나에서 0값이 되기에 retun NO를 출력
        for (char x: str2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.get(x)-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();

        System.out.print(solution(str1, str2));
    }
}
