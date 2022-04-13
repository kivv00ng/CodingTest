package com.company.HashMapAndTreeSet;

import java.util.*;
;

public class K번째큰수 {
    public static int solution(int n, int k, Integer[] arr){
        int answer = 0;
        List<Integer> sumList = new ArrayList<>();
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("#########");
        int sum=0;
        sum=arr[0]+arr[1];

        int lt=0;
        for (int rt=k-1; rt<n; rt++){
            sum += arr[rt];
            sumList.add(sum);
            sum -= arr[lt++];
        }

        Collections.sort(sumList, Collections.reverseOrder());
        for (int i =0; i<sumList.size();i++){
            System.out.println(sumList.get(i));
        }

        answer = sumList.get(k-1);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}
